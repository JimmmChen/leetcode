package jingchen;

import dataStructure.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;
public class MergeKSortedList {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode merged = new ListNode(0);
		ListNode firstNode = merged;
		if(lists.length == 0)
			return firstNode.next;
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
			@Override
			public int compare(ListNode o1, ListNode o2) {
				return o1.val - o2.val;
			}      	
		});
        for(ListNode node : lists){
            if(node!= null)
        	    pq.add(node);
        }
        while(!pq.isEmpty()){
        	ListNode temp = pq.poll();
        	merged.next = temp;
        	if(temp.next != null)
        		pq.add(temp.next);
        	merged = merged.next;
        }
        return firstNode.next;
    }		
}
