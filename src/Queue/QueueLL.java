package Queue;

public class QueueLL {
    public static class Node {
        int data;
        Node next;
        Node ( int data){
            this.data=data;
        }
    }
    public static class queuell{
        Node head=null;
        Node tail=null;
        int size=0;
        public void add(int val){
            Node temp = new Node(val);
            if (size==0){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public int peek(){
            if( size==0){
                System.out.println("empty");
                return -1;
            }
            return head.data;
        }
        public int remove(){
            if( size==0){
                System.out.println("empty");
                return -1;
            }
            int x=head.data;
            head =head.next;
            size--;
            return x;
        }
        public void displayyy(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        queuell q1=new queuell();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.displayyy();
    }
}
