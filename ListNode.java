/* You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, 
 and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 */
 
package com.DSA;
// definition of singly-link list
public class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val){ this.val = val;}
	ListNode(int val, ListNode next) {this.val = val; this.next = next;}

}

class Solution {
	public ListNode addTwoNumber(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode current = dummyHead;
		int carry = 0;
		
		while (l1 !=null || l2 != null) {
			int x = (l1 != null) ? l1.val : 0;
			int y = (l2 != null) ? l2.val : 0;
			int sum = carry + x + y ;
			carry = sum / 10;
			current.next = new ListNode (sum % 10);
			current = current.next;
			
			if (l1 != null) {l1 = l1.next;}
			if (l2 != null) {l2 = l2.next;}
			
		}
		if (carry > 0) {
			current.next = new ListNode(carry);
		}
		
		return dummyHead.next;
	}	
	
}

class Main {
	// helper method to create a linked list from an array
	public static ListNode createLinkedList(int[] arr) {
		ListNode dummy = new ListNode(0);
		ListNode current = dummy;
		for (int num : arr) {
			current.next = new ListNode(num);
			current = current.next;
		}
		return dummy.next;
	}
	
	public static void printLinkedList( ListNode head) {
		while (head != null) {
			System.out.print(head.val);
			if (head.next != null) {
				System.out.print(" -> ");
			}
			head = head.next;
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		
		// Example 1
		// create two linked lists representing numbers in reverse order
		ListNode l1 = createLinkedList(new int[] {2, 4, 3}); // represents 342
		ListNode l2 = createLinkedList(new int[] {5, 6, 4}); // represents 465
		
		System.out.println("Number 1:");
		printLinkedList(l1);
		System.out.println("Number 2:");
		printLinkedList(l2);
		
		Solution solution = new Solution();
		ListNode result = solution.addTwoNumber(l1, l2);
		
		System.out.println("sum: ");
		printLinkedList(result);
		
		// Example 2
		ListNode l3 = createLinkedList(new int[] {9, 9, 9, 9}); // represent 9999
		ListNode l4 = createLinkedList(new int[] {9, 9, 9, 9, 9, 9, 9}); // represents 9999999
		
		System.out.println("\nNumber 3: ");
		printLinkedList(l3);
		System.out.println("Number 4: ");
		printLinkedList(l4);
		
		
		ListNode result2 = solution.addTwoNumber(l3, l4);
		
		System.out.println("Sum: " );
		printLinkedList(result2);	
		
	
	
		
	}
}


