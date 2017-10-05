package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import jingchen.Multiply;

import org.junit.Test;

public class testMultiply {
	@Test
	public void test01(){
		Multiply m = new Multiply();
		System.out.println(m.multiply("123", "456"));
	}
}
