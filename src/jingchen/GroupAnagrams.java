package jingchen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();
        for(String s : strs){
            String sorted = sort(s);
            if(map.containsKey(sorted))
                map.get(sorted).add(s);
            else{
                List<String> list = new ArrayList<String>();
                list.add(s);
                map.put(sorted,list);
            }
        }
        List<List<String>> result = new ArrayList<List<String>>(map.values());
        return result;
    }
                    
    private String sort(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
