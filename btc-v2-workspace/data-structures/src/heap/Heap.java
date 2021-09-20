package heap;

public class Heap {
	
	public Node[] heapArray;
	
	private int maxSize;
	
	private int currentSize;

	public Heap(int size) {
		super();
		this.maxSize = size;
		this.heapArray = new Node[maxSize];
		this.currentSize = 0;
	}
	
	public int getSize() {
		return currentSize;
	}
	
	public boolean isEmpty() {
		return (currentSize==0);
	}
	
	public boolean insert(int key) {
		if(currentSize==maxSize) {
			return false;
		}
		Node newNode=new Node(key);
		
		heapArray[currentSize]=newNode;
		shiftUp(currentSize);
		currentSize++;
		return true;
	}

	private void shiftUp(int idx) {
		
		int parentIndex=(idx-1)/2;
		Node nodeToInsert=heapArray[idx];
		while (idx>0 && heapArray[parentIndex].getKey()<nodeToInsert.getKey()) {
			
			heapArray[idx]=heapArray[parentIndex];
			idx=parentIndex;
			parentIndex=(parentIndex-1)/2;
			
		}
		heapArray[idx]=nodeToInsert;
		
	}
	

}
