package test;

import jingchen.MinimumWindowSubstring;

import org.junit.Test;

public class testMinimumWindowSubstring {
	@Test
	public void test01(){
		MinimumWindowSubstring mws = new MinimumWindowSubstring();
		//System.out.println(mws.minWindow("aaflslflsldkalskaaa", "aaa"));
		//System.out.println(mws.minWindow("aa", "aa"));
		System.out.println(mws.minWindow("aa", "a"));
	}
}
	