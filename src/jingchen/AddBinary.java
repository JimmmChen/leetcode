package jingchen;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuffer sba = new StringBuffer(a);
        StringBuffer sbb = new StringBuffer(b);
        sba.reverse();
        sbb.reverse();
        int max = sba.length() > sbb.length()? sba.length():sbb.length();
        for(int i = sba.length();i < max;i++)
                sba.append(0);     
        for(int i = sbb.length();i < max;i++)
                sbb.append(0);   
        StringBuffer result = new StringBuffer();
        int carry = 0;
        for(int i = 0;i < max;i++){
            int n = Integer.parseInt(sba.charAt(i) + "") + Integer.parseInt(sbb.charAt(i) + "");
            if(carry == 1){
                n++;
                carry = 0;
            }
            if(n > 1)
                carry = 1;
            result.append(n % 2);
        }
        if(carry == 1)
            result.append(1);
        return result.reverse().toString();
    }
}
