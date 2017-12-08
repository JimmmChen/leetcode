package test;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

import org.junit.Test;

public class test {
	@Test
	public void test01() {
//		HashSet<Integer> set = new HashSet<Integer>();
//		Queue<Integer> visited = new ArrayDeque<>();
//
//		Stack<Integer> vi = new Stack<>();
		String s = new String();
		s = "0	50	5	881250949";
		String[] temp = s.split("\t");
		for(String s0:temp)
			System.out.println(s0);
	}
}
