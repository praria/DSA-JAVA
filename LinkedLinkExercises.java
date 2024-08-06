package com.DSA;
public class LinkedLinkExercises{
	
	class Node{
		int val;
		Node next;
		public Node(int val) {
			this.val = val;
		}
	}
	
	static Node head = null;
	Node tail = null;
	
	public void addNodeAtEnd(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			newNode.next = null;
			tail = newNode;
		}
		
	}
	
	public void deleteNodeAtEnd() {
		Node current  = head;
		while (current.next.next != null) {
			current = current.next;
		}
		current.next = null;
		tail = current;		
	}
	
	
	public void addNodeAtStart(int val) {
		Node newNode = new Node(val);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	
	public  void deleteNodeAtStart(){
		head = head.next;
	}
	
	
	public void addNodeAtIndex(int val, int index) {
		int count = 1;
		Node current = head;
		while (current.next != null && count != index -1) {
			current = current.next;
			count++;
		}
		Node temp = current.next;
		Node newNode = new Node(val);
		current.next = newNode;
		newNode.next = temp;

	}
	
	public void deleteNodeAtIndex(int index) {
		int count =1;
		Node current = head;
		while (current.next != null && count!= index -1) {
			current = current.next;
			count++;
		}
		Node temp = current.next.next;
		current.next = temp;
	}
	
	public void printLinkedList(Node headNode) {
		Node current = headNode;
		while (current != null) {
			System.out.println(current.val);
			current = current.next;
			
			
		}
	}
	public static void main(String[] args) {
		LinkedLinkExercises l= new LinkedLinkExercises();
		l.addNodeAtEnd(0);
		l.addNodeAtEnd(10);
		l.addNodeAtEnd(20);
		l.addNodeAtEnd(30);
		l.addNodeAtStart(-1);
		l.printLinkedList(head);
//		l.addNodeAtIndex(48, 4);
//		l.deleteNodeAtEnd();
//		l.deleteNodeAtStart();
		l.deleteNodeAtIndex(3);
		l.printLinkedList(head);
		
		
	}
}