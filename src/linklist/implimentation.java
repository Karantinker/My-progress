package linklist;
// abb ban gye hai pro
//isliy abb ham connect karne ki orr baaar baar
//node object bnane ki preshani ni uthayenge

public class implimentation {
    public static class Node {
        int data;
        Node next;
        Node(int data ){
            this.data=data;
        }
    }
    public static class linkedlist {
        Node head = null;
        Node tail = null;

        //abb ham ek function banayenge insertatend()
        //jisse ham element ko end mai daal ske
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if(head==null){//agar head he null hua toh
                head=temp;
                tail=temp;
            }
            else {
                tail.next=temp;
            }
            tail=temp;

        }
        void insertAtfirst(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else {
                temp.next=head;
                head=temp;
            }
        }
        //display karne ke liy
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(

            );
        }
            int size() {
                Node temp = head;
                int count = 0;
                while (temp != null) {
                    count++;
                    temp=temp.next;
                }
                return count;
            }

    }

    public static void main(String[] args) {
        linkedlist ll= new linkedlist();
        ll.insertAtEnd(10);
        ll.display();
        ll.insertAtEnd(20);
        ll.display();
        ll.insertAtEnd(30);
        ll.display();
        ll.insertAtfirst(33);
        ll.display();
        ll.insertAtfirst(1111);


    }

}
