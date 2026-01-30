package dsa_DAY2_Assignment;

class CircularQueueMethods {

	private int[] queue;
	private int front, rear, size;

	public CircularQueueMethods(int size) {
		this.size = size;
		queue = new int[size];
		front = -1;
		rear = -1;
	}

	public boolean isFull() {
		return (rear + 1) % size == front;
	}

	public boolean isEmpty() {
		return front == -1;
	}

	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue is Full! Cannot insert " + data);
			return;
		}

		if (front == -1) {
			front = 0;
		}

		rear = (rear + 1) % size;
		queue[rear] = data;
		System.out.println(data + " inserted into Circular Queue");
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is Empty! Cannot delete");
			return -1;
		}

		int value = queue[front];
		System.out.println(value + " removed from Circular Queue");

		if (front == rear) {
			front = rear = -1;
		} else {
			front = (front + 1) % size;
		}

		return value;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}

		System.out.print("Circular Queue elements: ");
		int i = front;
		while (true) {
			System.out.print(queue[i] + " ");
			if (i == rear)
				break;
			i = (i + 1) % size;
		}
		System.out.println();
	}
}

public class CircularQueue {
	public static void main(String[] args) {

		CircularQueueMethods cq = new CircularQueueMethods(5);

		cq.enqueue(10);
		cq.enqueue(20);
		cq.enqueue(30);
		cq.enqueue(40);
		cq.enqueue(50);

		cq.display();

		cq.dequeue();
		cq.dequeue();

		cq.display();

		cq.enqueue(60);
		cq.enqueue(70);

		cq.display();
	}
}
