package lesson11_dsa_stack_queue.optional.practice;

public class QueueClient {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);
        queue.enqueue(23);
        queue.enqueue(8);
        queue.enqueue(93);
        queue.enqueue(11);
        queue.enqueue(7);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(123);
        queue.dequeue();
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(32);
        queue.enqueue(435);
    }
}
