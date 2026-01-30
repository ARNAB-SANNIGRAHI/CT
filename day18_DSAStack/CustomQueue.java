package day18_DSAStack;

class CustomQueueMethods {
	private int size;
	private int[] queue;
	private int front;
	private int rear;
	
	public CustomQueueMethods(int size) {
		          this.size = size;
		          queue = new int[size];
		          this.front= 0;
		          this.rear = -1;
	}
	
	public boolean isFull() {
		return rear == size-1;
	}
	public int enque(int element) {
		if(isFull()) {
			throw new RuntimeException("Queue is full!...");
		}
		queue[++rear] =  element;
		return element;
	}
	public boolean isEmpty() {
		return front>rear;
	}
	public int deque() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is Empty!...");
		}
		return queue[front++];
	}
	public int size() {
		return rear-front+1;
	}
	public int peek() {
	    if (isEmpty()) {
	        throw new RuntimeException("Queue is Empty!...");
	    }
	    return queue[front];
	}

}
public class CustomQueue{
	public static void main(String[] args) {
		CustomQueueMethods queue = new CustomQueueMethods(4);
		queue.enque(1);
		queue.enque(2);
		queue.enque(3);
		queue.enque(4);
		
		System.out.println(queue.peek());
		
		while(!queue.isEmpty()) {
			System.out.print(queue.deque()+" ");
		}
		//System.out.println(queue.deque());//  ->It will throw exception
	}
}



