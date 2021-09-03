package singlylinkedlist;

public class SinglyLinkedList {

	private Node first;
	private Node last;
	
	public SinglyLinkedList() {
		
	}
	
	public void insertFirst(int data) {
		
		Node newNode= new Node();
		newNode.data=data;
		newNode.next=first;
		first=newNode;
		
	}
	
	public Node deleteFirst() {
		Node temp=first;
		first=first.next;
		return temp;
	}
	
	public void insertLast(int data) {
		
		Node current=first;
		while(current.next !=null) {
			current=current.next;
		}
		Node newNode= new Node();
		newNode.data=data;
		current.next=newNode;
	}
	
}
