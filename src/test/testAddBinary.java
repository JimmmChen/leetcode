package test;

import java.util.LinkedList;
import java.util.Queue;

import jingchen.AddBinary;

import org.junit.Test;

public class testAddBinary {
	@Test
	public void test01(){
		String a = "1010";
		String b = "1011";
		AddBinary ab = new AddBinary();
		System.out.println(ab.addBinary(a, b));
		Queue<String> q = new LinkedList<String>() ;
	}
}
