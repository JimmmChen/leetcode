package jingchen;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
	public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        List<String> num2String = new ArrayList<String>();
        for(int i = 0;i < digits.length();i++){
            String numToChars = null;
            switch(digits.charAt(i)){
                case '2':
                    numToChars = "abc";
                    break;
                case '3':
                    numToChars = "def";
                    break;
                case '4':
                    numToChars = "ghi";
                    break;
                case '5':
                    numToChars = "jkl";
                    break;
                case '6':
                    numToChars = "mno";
                    break;
                case '7':
                    numToChars = "pqrs";
                    break;
                case '8':
                    numToChars = "tuv";
                    break;
                case '9':
                    numToChars = "wxyz";
                    break;
                default:
                    break;
            }
            if(numToChars != null)
                num2String.add(numToChars);
        }
        StringBuffer s = new StringBuffer();
        selectFromEachStr(result,num2String,s,0);
        return result;
    }
    private void selectFromEachStr(List<String> result, List<String> num2String, StringBuffer s, int n){
        if(n >= num2String.size())
            return;
        for(int i = 0;i < num2String.get(n).length();i++){
            s.append(num2String.get(n).charAt(i));
            if(n == num2String.size()-1){
                String s0 = new String(s.toString());
                result.add(s0);
            } else 
                selectFromEachStr(result,num2String,s,n+1);
            s.deleteCharAt(s.length()-1);              
        }
}
}
