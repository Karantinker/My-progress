package practice;
import java.util.*;
//implimentation with Arraylist
public class practice {

   static class stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }
              //push
        public static void push(int data) {
            list.add(data);
        }
                  //pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }
             //peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }


        public static void main(String[] args) {
            Stack stack=new Stack();
            stack.push(5);
            stack.push(9);
            stack.push(10);
            stack.push (9998);
            while (!stack.isEmpty()){
                System.out.println(stack.peek());
                stack.pop();

        }
    }

}
}