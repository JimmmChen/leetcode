package test;

import jingchen.CourseSchedule;

import org.junit.Test;

public class testCourseSchedule {
	@Test
	public void test01(){
		CourseSchedule cs = new CourseSchedule();
		int[][] pre = {{0,1}};
		int[] s = cs.findOrder(2, pre);
	}
}
