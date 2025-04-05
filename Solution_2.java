import java.util.*;

class Queue {
    private LinkedList<Integer> list;
    public Queue() {
        list = new LinkedList<>();
    }
    public void enqueue(int data) {
        list.addLast(data);
    }
    public int dequeue() {
        if (isEmpty()) {
           return 0;
        }
        return list.removeFirst();
    }
    public int peek() {
        if (isEmpty()) {
            return 0;
        }
        return list.getFirst();
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front: " + queue.peek()); 
        System.out.println("deleted: " + queue.dequeue());   
        System.out.println("Front: " + queue.peek());
        System.out.println("queue empty : " + queue.isEmpty()); 
    }
}
