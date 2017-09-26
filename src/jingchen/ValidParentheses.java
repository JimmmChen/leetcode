package jingchen;

import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
        Stack<String> stack = new Stack<String>();
        int index = 0;
        while(index < s.length()){
            String temp = s.charAt(index)+"";
            if(temp.equals("(") ||temp.equals("[") || temp.equals("{"))
                stack.push(temp);
            else{
                if(stack.isEmpty())
                    return false;
                switch(temp){
                    case ")":
                        if(!stack.pop().equals("("))
                            return false;
                        break;
                    case "]":
                        if(!stack.pop().equals("["))
                            return false;
                        break;
                    case "}":
                        if(!stack.pop().equals("{"))
                            return false;
                        break;
                }
            }
            index++;
        }
        if(stack.isEmpty())
            return true;
        else 
            return false;
    }
}
