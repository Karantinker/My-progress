package Queue;

public class QueueY {
    static class queue {
        static int arr[] = new int[5];
        static int size;
        static int rear = -1;
        static int front = -1;

        //enqueue
        public static void add(int data) {
            if (rear == arr.length - 1) {//for full queue
                System.out.println("queue is full");
                return;
            }
            if (front == -1){
                front = rear = 0;
                arr[0]=data;
            }//jab koii value ni ho tb front or rear dono 0th index pe chale jaynege
            else {
                arr[++rear] = data;//verna add acse mai rear ko ek aage badhate jayenege
            }
            size++;
        }

        public static int remove() {
            if (size == 0) {
                System.out.println("queue is empty");
                return -1;
            }
            front++;
            size--;
            //lekin mujhe return bhi karna hai remove value ko
            return arr[front - 1];
        }

        public static int peek() {
            if (size == 0) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];
        }

        public static void display() {
            for (int i = front; i < rear; i++) {
                System.out.println(arr[i]);
            }
        }

    }
        public static void main(String[] args) {

            queue q = new queue();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            q.display();
q.remove();
q.display();

    }
}