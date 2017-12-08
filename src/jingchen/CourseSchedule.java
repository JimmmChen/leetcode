package jingchen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] count = new int[numCourses];
        HashMap<Integer, List<Integer>> graph= new HashMap<Integer, List<Integer>>();
        initialGraph(count,graph,prerequisites);
        return hasorderByBFS(count,graph);
    }
    
    private void initialGraph(int[] count, HashMap<Integer, List<Integer>> graph, int[][] prerequisites){
        for(int[] edge:prerequisites){
            if(!graph.containsKey(edge[1])){
                List<Integer> list = new ArrayList<>();
                list.add(edge[0]);
                graph.put(edge[1],list);
            } else 
                graph.get(edge[1]).add(edge[0]);
            count[edge[0]]++;
        }
    }
    
    private int[] hasorderByBFS(int[] count, HashMap<Integer, List<Integer>> graph){
        int[] order = new int[count.length];
        Queue<Integer> tovisit = new LinkedList<>();
        for(int i = 0 ;i < count.length;i++)
            if(count[i] == 0)
                tovisit.add(i);                 
        int visited = 0;
        while(!tovisit.isEmpty()){
            int from = tovisit.poll();
            order[visited++] = from;
            if(!graph.containsKey(from)) break;
            for(Integer i: graph.get(from)){
                count[i]--;
                if(count[i] == 0)
                    tovisit.add(i);
            }
        }
        return visited == count.length ? order:new int[0];
    }
}
