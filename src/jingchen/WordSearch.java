package jingchen;

import java.util.Stack;

public class WordSearch {
	public boolean exist(char[][] board, String word) {
		if (word.length() == 0)
			return true;
		Stack<String> stack = new Stack<String>();
		boolean[][] visited = new boolean[board.length][board[0].length];
		char first = word.charAt(0);
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == first)
					stack.add(new String(i + "," + j));
			}
		}
		while(!stack.isEmpty()){
			boolean finded = search(board, word, 0, stack, visited);
			if(finded)
				return true;
		}
		return false;
	}

	private boolean search(char[][] board, String word, int i,
			Stack<String> stack, boolean[][] visited) {
		String index = stack.pop();
		if (index == null)
			return false;
		int row = Integer.parseInt(index.split(",")[0]);
		int column = Integer.parseInt(index.split(",")[1]);
		if (board[row][column] == word.charAt(i)) {
			visited[row][column] = true;
			if (i == word.length() - 1)
				return true;
			int size = stack.size();
			if (column + 1 != board[0].length
					&& visited[row][column + 1] != true)
				stack.add(new String(row + "," + (column + 1)));
			if (row + 1 != board.length && visited[row + 1][column] != true)
				stack.add(new String((row + 1) + "," + column));
			if (column != 0 && visited[row][column - 1] != true)
				stack.add(new String(row + "," + (column - 1)));
			if (row != 0 && visited[row - 1][column] != true)
				stack.add(new String((row - 1) + "," + column));
			int sizenow = stack.size();
			for (int j = 0; j < sizenow - size; j++)
				if (search(board, word, i + 1, stack, visited))
					return true;
			visited[row][column] = false;
			return false;
		} else
			return false;
	}
}
