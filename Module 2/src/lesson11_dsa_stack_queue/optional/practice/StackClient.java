package lesson11_dsa_stack_queue.optional.practice;

public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(6);
        stack.push(23);
        stack.push(8);
        stack.push(93);
        stack.push(11);
        stack.push(7);
//        stack.push(95);
        System.out.println(stack.isFull());
        System.out.println("1. Size of stack after push operations: " + stack.size());
        System.out.println("Pop elements from stack!");

        while(!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3. Size of stack after pop operations: " + stack.size());
    }
}
