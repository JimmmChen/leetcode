package dataStructure;
import java.util.HashMap;
public class Queue {
	private Node first;
	private Node last;
	private int N;
	private int SIZE;
	HashMap<Node, Node> child2father = new HashMap<Queue.Node, Queue.Node>();
	HashMap<Integer, Node> intToNode = new HashMap<Integer, Queue.Node>();
	public Queue(int capacity){
		this.SIZE = capacity;
	}
	
	private class Node{
		int item;
		Node next;
	}
	
	public boolean isEmpty(){
		return N==0;
	}
	
	public int size(){
		return N;
	}
	
	public int maxsize(){
		return SIZE;
	
	}
	public int enqueue(int item){;
		int deleted = 0;
		if(N == SIZE)
			deleted = deleteFirst();
		Node oldlast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		intToNode.put(Integer.valueOf(item), last);
		if(isEmpty()) {
			first = last;
			child2father.put(last, null);
		}
		else {
			oldlast.next = last;
			child2father.put(last, oldlast);
		}
		N++;
		return deleted;
	}
	
	private int deleteFirst(){
		int temp = first.item;
		Node node2delete = intToNode.get(Integer.valueOf(temp));
		child2father.put(node2delete.next, null);
		intToNode.remove(Integer.valueOf(temp));
		first = first.next;
		if(isEmpty()) {
			last = null;
		}
		N--;
		return temp;
	}
	
	public void refresh(int n){
		Node node = intToNode.get(Integer.valueOf(n));
		Node father = child2father.get(node);
		child2father.remove(node);
		if(father == null){
			first = first.next;
			if(first != null)
				child2father.put(first, null);
		} else {
			father.next = node.next;
			if(node.next == null)
				last = father;
			else
				child2father.put(node.next, father);
		}
		N--;
		enqueue(n);
	}
}
