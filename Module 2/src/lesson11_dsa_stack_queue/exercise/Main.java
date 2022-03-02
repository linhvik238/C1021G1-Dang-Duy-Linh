package lesson11_dsa_stack_queue.exercise;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.front = queue.rear = null;

        queue.enQueue(queue, 11);
        queue.enQueue(queue, 23);
        queue.enQueue(queue, 7);

        queue.displayQueue(queue);

        System.out.printf("\nDeleted value = %d", + queue.deQueue(queue));
        System.out.printf("\nDeleted value = %d", + queue.deQueue(queue));

        queue.displayQueue(queue);
        queue.enQueue(queue, 11);
        queue.enQueue(queue, 93);
        queue.enQueue(queue, 95);
        queue.displayQueue(queue);
    }
}
