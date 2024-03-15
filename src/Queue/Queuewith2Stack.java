package Queue;
import java.util.*;

public class Queuewith2Stack {
    static class Queue {
        static Stack<Integer> S1 = new Stack<>();
        static Stack<Integer> S2 = new Stack<>();

        public static boolean isEmpty() {
            return S1.isEmpty();
        }

        public static void add(int data) {
            while (S1.isEmpty()) {
                S2.push(S1.pop());
            }
            S1.push(data);
            while (S2.isEmpty()) {
                S1.push(S2.pop());
            }
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return S1.pop();

        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return S1.peek();
        }


        public static void main(String[] args) {
            Queue q = new Queue();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);

            while (q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();
            }
        }
    }
    }
