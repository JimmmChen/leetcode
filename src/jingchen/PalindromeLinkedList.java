package jingchen;

import dataStructure.ListNode;

public class PalindromeLinkedList {
	public static void main(String[] args){
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(2);
		ListNode d = new ListNode(1);
		a.next = b;
		b.next = c;
		c.next = d;
		System.out.println(new PalindromeLinkedList().isPalindrome(a));
	}
	public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        int n = 0;
        ListNode temp = head;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        ListNode pre = null;
        for(int i = 0;i < n/2;i++){
            temp = head;
            head = head.next;
            temp.next = pre;
            pre = temp;
        }
        if(n % 2 != 0)
            head = head.next;
        while(head != null && temp != null){
            if(head.val != temp.val)
                return false;
            else{
                head = head.next;
                temp = temp.next;
            }
        }
        return true;
    }
}
