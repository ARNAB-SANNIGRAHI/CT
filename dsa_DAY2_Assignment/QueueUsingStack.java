package dsa_DAY2_Assignment;

class ArrayQueue {
    private int[] queue;
    private int front = 0, rear = -1, size;

    public ArrayQueue(int size) {
        this.size = size;
        queue = new int[size];
    }

    public void enqueue(int data) {
        if (rear == size - 1) {
            throw new RuntimeException("Queue Overflow");
        }
        queue[++rear] = data;
        System.out.println(data + " inserted into queue");
    }

    public int dequeue() {
        if (front > rear) {
            throw new RuntimeException("Queue Underflow");
        }
        int value = queue[front++];
        System.out.println(value + " removed from queue");
        return value;
    }
}

public class QueueUsingStack {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.dequeue();
        queue.dequeue();
    }
}
