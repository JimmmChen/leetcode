package test;

import jingchen.WordSearch;

import org.junit.Test;

public class testWordSearch {
	@Test
	public void test01(){
		char[][] board = {{'a','b','c','e'},{'s','f','c','s'},{'a','d','e','e'}};
		String word = "abcced";
		WordSearch ws = new WordSearch();
		System.out.println(ws.exist(board, word));
	}
}
