package test;

import jingchen.TaskScheduler;

import org.junit.Test;

public class taskScheduler {
	@Test
	public void test01(){
		TaskScheduler ts = new TaskScheduler();
		char[] tasks= {'A','A','A','A','A','B','B','B','B','C','C','C','C','D','D','D','D','E','E','E'};
		System.out.println(ts.leastInterval0(tasks, 2));
	}
}
