package jingchen;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class TaskScheduler {
	public int leastInterval(char[] tasks, int n) {
		int[] count = new int[26];
		for (char c : tasks)
			count[c - 'A']++;
		PriorityQueue<Integer> maxheap = new PriorityQueue<>(10000,new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		Stack<Integer> temp = new Stack<Integer>();
		for (int i : count)
			if (i > 0) maxheap.add(i);
		int sum = 0, last = 0;
		while (!maxheap.isEmpty()) {
			last = 0;
			for (int i = 0; i < n + 1; i++) {
				if (maxheap.isEmpty()) break;
				int k = maxheap.poll();
				k--;
				last++;
				if (k > 0) temp.push(k);
			}
			sum += n+1;
			while(!temp.isEmpty()) maxheap.add(temp.pop());
		}
		return sum-(n+1-last);
	}
    public int leastInterval0(char[] tasks, int n) {

        int[] c = new int[26];
        for(char t : tasks){
            c[t - 'A']++;
        }
        Arrays.sort(c);
        int i = 25;
        while(i >= 0 && c[i] == c[25]) i--;

        return Math.max(tasks.length, (c[25] - 1) * (n + 1) + 25 - i);
    }
}
