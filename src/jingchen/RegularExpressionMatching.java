package jingchen;

public class RegularExpressionMatching {
	public boolean isMatch(String s, String p) {
        return isMatch(s,0,p,0);
    }
    
    private boolean isMatch(String s, int sIndex, String p, int pIndex) {
        if(sIndex == s.length()){
           if(pIndex == p.length())
               return true;
            else if(pIndex < p.length()-1 && p.charAt(pIndex+1) == '*')
                return isMatch(s,sIndex,p,pIndex+2);
            else 
                return false;
        }
        else if(pIndex == p.length()){
            if(sIndex == s.length())
                return true;
            else 
                return false;
        }
        
        if(pIndex != p.length()-1 && p.charAt(pIndex+1) == '*'){
            if(p.charAt(pIndex) == '.' || s.charAt(sIndex) == p.charAt(pIndex) )
                return isMatch(s,sIndex+1,p,pIndex) || isMatch(s,sIndex,p,pIndex+2) || isMatch(s,sIndex+1,p,pIndex+2);
            else if(s.charAt(sIndex) != p.charAt(pIndex))
                return isMatch(s,sIndex,p,pIndex+2);
        }
        else if(p.charAt(pIndex) == '.' || s.charAt(sIndex) == p.charAt(pIndex))
            return isMatch(s,sIndex+1,p,pIndex+1);
        return false;         
    }
}
