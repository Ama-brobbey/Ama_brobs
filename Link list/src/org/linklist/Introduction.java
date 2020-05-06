package org.linklist;

public class Introduction {
	Node head;// head of list.
	
	//Linked list Node
	static class Node{
		int data;
		Node next;
		
		//constructor to create a new node
		Node (int d){
			data = d;
			next = null;
		}
	}
	public static void main(String args []) {
 //calling the first class
		Introduction emptyList = new Introduction();
		//Creating  nodes
		emptyList.head = new Node(10);
		Node secondNode = new Node(16);
		Node thirdNode = new Node(21);
		//Linking the created nodes with empty linked list
		emptyList.head.next = secondNode;//connect first node with second node
		emptyList.head.next.next = thirdNode;//connect second node with third node
		//printing the linked list items
		emptyList.printLinkedList();
		
		//method for printing linked list items
		
		}
private void printLinkedList() {
	Node tempNode = head;
	while (tempNode != null) {
System.out.println(tempNode.data + " ");
tempNode = tempNode.next;
}
}
}