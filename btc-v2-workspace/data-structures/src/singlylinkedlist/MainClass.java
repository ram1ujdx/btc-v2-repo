package singlylinkedlist;

public class MainClass {

	public static void main(String[] args) {
		
		Node node1=new Node();
		node1.data=100;
		
		
		
		Node node2=new Node();
		node1.next=node2;
		node2.data=200;
		
		
		
		Node node3=new Node();
		node2.next=node3;
		node3.data=300;
		
		
		Node currNode=node1;
		
		while(currNode!=null) {
			currNode.displayNode();
			currNode=currNode.next;
		}
		

	}

}
