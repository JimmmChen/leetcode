package test;

import java.util.Stack;

import jingchen.ValidParentheses;

import org.junit.Test;

public class testValidParentheses {
	@Test
	public void test01(){
		String s = "()";
		ValidParentheses vp = new ValidParentheses();
		System.out.println(vp.isValid(s));	

	}
}
