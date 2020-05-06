package org.linklist;


public class InsertNode {

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
	
	//Inserting node (At front, at center, at end).
	 //Printing out original value
	private void previousItems(InsertNode list) {
		list.head = new Node(5);
		Node secondNode = new Node(9);
		Node thirdNode = new Node (6);
		//Linking the nodes with empty linked list
		list.head.next = secondNode;//connecting the first node to the second node.
		list.head.next.next = thirdNode;// connecting the second node to the third node.
		// printing out the linked list items
	}
		private void printLinkedList(String message) {
			System.out.println(message);
			Node listNode = head;
			while(listNode != null) {
System.out.println(listNode.data +" ");
listNode = listNode.next;
		}
	System.out.println("");
		}
		public static void main (String args []) {
			InsertNode list = new InsertNode();
			list.previousItems(list);
			list.printLinkedList("Initial Items");
			//insert at front of linked list
			list.insertAtFront(19);
			list.printLinkedList("After insertion at front");
			//insert node after given node
			list.insertNodeAfterGivenNode(list.head.next,98);
			list.printLinkedList("insertion of node after given node");
			//insert node at the end of linke list
			list.insertNodeAtEnd(29);
			list.printLinkedList("After insertion at end");
		}
		private void insertAtFront(int dataValue) {
Node newNode = new Node(dataValue);
newNode.next = head;
head = newNode;
}
		private void insertNodeAfterGivenNode(Node givenNode, int dataValue) {
			Node newNode = new Node(dataValue);
			//check if given node is null
			if(givenNode == null) {
				System.out.println("Given node is null");
				return;
			}
			newNode.next = givenNode.next;
			givenNode.next = newNode;
		}
		private void insertNodeAtEnd(int dataValue) {
			Node newNode = new Node(dataValue);
			if (head == null) { 
				head = newNode;
				return;
			}
			Node end = head;
			while (end.next != null) {
				end = end.next;
			}
			end.next = newNode;
			}
		}

