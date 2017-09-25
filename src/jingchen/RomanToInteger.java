package jingchen;

import java.util.HashMap;

public class RomanToInteger {
	public int romanToInt(String s) {
        HashMap<Character,Integer> romanToInt = new HashMap<Character,Integer>();
        romanToInt.put('M',new Integer(1000));
        romanToInt.put('D',new Integer(500));
        romanToInt.put('C',new Integer(100));
        romanToInt.put('L',new Integer(50));
        romanToInt.put('X',new Integer(10));
        romanToInt.put('V',new Integer(5));
        romanToInt.put('I',new Integer(1));
        int result = 0;
        for(int i = 0;i < s.length()-1;i++){
            int value0 = romanToInt.get(s.charAt(i)).intValue();
            int value1 = romanToInt.get(s.charAt(i+1)).intValue();
            if(value0 < value1)
                result -= value0;
            else 
                result += value0;
        }
        result += romanToInt.get(s.charAt(s.length()-1)).intValue();
        return result;
    }
}
