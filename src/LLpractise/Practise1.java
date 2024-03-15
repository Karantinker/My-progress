package LLpractise;
//find the nth Node from last

public class Practise1 {
//    public static Node nthNode(Node head,int x){//kuki ham head lenge isliy or position bhi
//        //for size
//        int size =0;
//        Node temp= head ;//travel karane ke lliy
//        while (temp!=null){
//            size++;
//            temp=temp.next;//ye null tak chala jayega
//        }
//        int m= size-x+1;
//        temp=head;
//        //null tak temp jaane ki vajah se ham dubara usee head pe laayeng
//        //taki ham travel kar sake head se
//        for (int i=0;i<m-1;i++){
//            temp=temp.next;//vaaps travel kara diya node ke liy
//
//        }
//        return temp;
//    }
    public static Node secondNthmethod(Node head,int n){//time complexity jada hone ki vajah se
        Node fast= head;
        Node slow= head;
        for(int i= 0;i<n;i++ ){
            fast=fast.next;
        }
        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static void deleteNthfromEnd(Node head,int x){
        Node fast= head;
        Node slow= head;
        for (int i=0;i<x;i++){
            fast = fast.next;
        }
        while (fast.next!=null){
            slow =slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
    }
    public static void display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        public static void main(String[] args) {
            Node a = new Node(2);
            Node b = new Node(4);
            Node c = new Node(6);
            Node d = new Node(8);
            Node e = new Node(10);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;

//            Node temp = a;
//            while (temp != null) {
//                System.out.println(temp.data);
//                temp = temp.next;
//            }
//             Node K= secondNthmethod(a ,3);
//            System.out.println(K.data);
//            Node k=nthNode(a,3);
//            System.out.println(k.data );
            display(a);
            deleteNthfromEnd(a,4);
            display(a);
        }
        }

    }
