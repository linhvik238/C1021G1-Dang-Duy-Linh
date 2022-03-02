package lesson11_dsa_stack_queue.practice;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(23);
        queue.enqueue(11);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(93);
        queue.enqueue(8);
        queue.enqueue(7);
        System.out.println("Dequeue item is: " + queue.dequeue().key);
    }
}
