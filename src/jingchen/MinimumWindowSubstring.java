package jingchen;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumWindowSubstring {
	int N = 0;
	boolean flag = false;
	Node first = null;
	Node last = null;
	HashMap<String, Queue<Node>> map = new HashMap<String, Queue<Node>>();
	HashMap<String, Integer> times = new HashMap<String, Integer>();

	private class Node {
		int index;
		Node pre;
		Node next;

		private Node(int index) {
			this.index = index;
		}
	}

	private void add(String s, int index) {
		Node newnode = new Node(index);
		if (!map.containsKey(s)) {
			Queue<Node> q = new LinkedList<Node>();
			map.put(s, q);
		}
		map.get(s).add(newnode);
		if (first == null) {
			first = newnode;
			last = newnode;
		} else {
			first.pre = newnode;
			newnode.next = first;
			first = newnode;
		}
	}

	private void refresh(String s, int index) {
		Node node = map.get(s).poll();
		node.index = index;
		map.get(s).add(node);
		if (node == first)
			return;
		else if (node == last) {
			last = node.pre;
			last.next = null;
			node.pre = null;
			node.next = first;
			first.pre = node;
			first = node;
		} else {
			node.pre.next = node.next;
			node.next.pre = node.pre;
			node.pre = null;
			node.next = first;
			first.pre = node;
			first = node;
		}
	}

	public String minWindow(String s, String t) {
		int minLength = Integer.MAX_VALUE;
		int[] index = new int[2];

		for (int i = 0; i < t.length(); i++) {
			if (times.containsKey(t.charAt(i) + ""))
				times.put(t.charAt(i) + "", times.get(t.charAt(i) + "") + 1);
			else
				times.put(t.charAt(i) + "", 1);
		}

		for (int i = 0; i < s.length(); i++) {
			if (!times.containsKey(s.charAt(i) + ""))
				continue;
			int time = times.get(s.charAt(i) + "");
			if (!flag && time > 0) {
				times.put(s.charAt(i) + "", time - 1);
				add(s.charAt(i) + "", i);
				N++;
				if (N == t.length()) {
					flag = true;
					minLength = i - last.index;
					index[0] = last.index;
					index[1] = i;
				}
				continue;
			}

			refresh(s.charAt(i) + "", i);

			if (flag && i - last.index < minLength) {
				minLength = i - last.index;
				index[0] = last.index;
				index[1] = i;
			}
		}
		if (flag)
			return s.substring(index[0], index[1] + 1);
		else
			return "";
	}
}
