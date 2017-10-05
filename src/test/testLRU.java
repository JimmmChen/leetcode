package test;

import org.junit.Test;

import dataStructure.LRUCache;

public class testLRU {
	@Test
	public void test(){
		LRUCache lru = new LRUCache(3);
		lru.put(1,1);
		lru.put(2,2);
		lru.put(3,3);
		lru.put(4,4);
		System.out.println(lru.get(4));
		System.out.println(lru.get(3));
		System.out.println(lru.get(2));
		System.out.println(lru.get(1));
		lru.put(5, 5);
		System.out.println(lru.get(1));
		System.out.println(lru.get(2));
		System.out.println(lru.get(3));
		System.out.println(lru.get(4));
		System.out.println(lru.get(5));
	}
}
