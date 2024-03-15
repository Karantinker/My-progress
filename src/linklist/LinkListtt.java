package linklist;

public class LinkListtt {
    public static class Node{
        int data;
        Node next;
        Node(int data){

            this.data=data;
        }
    }

        Node head = null;
        Node tail = null;


        void insertAtEnd(int val) {

            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    //with function

//    public static void display(Node head ) {
//        while (head != null) {
//            System.out.println(head.data);
//            head = head.next;
//        }
//    }
    //length
//    public static int length(Node head){
//
//        int count= 0;
//        while(head !=null){
//            count++;
//            head=head.next;
//
//        }
//        return count;
//
//    }

    //recursively linkedlist

    /*public static void displayr(Node head){
        if(head==null )return;

        System.out.print(head.data);
        displayr(head.next);

    }*/


    public static void main(String []args){

        //insertAtEnd method ki vajah se ye sb already connected hai


       LinkListtt ll=new LinkListtt();
       ll.insertAtEnd(7);
       ll.insertAtEnd(6);
       ll.insertAtEnd(9);
       ll.display();

        //jab insertAtEnd method use karte hai tab ye lines likhne ki jarurat ni padhti

       /* Node a = new Node(5);
        Node b= new Node(25);
        Node c = new Node(9);
        Node d = new Node(50);
        Node e = new Node(11);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;*/

      /*  System.out.println(a.next);
        System.out.println(b.next);
        System.out.println(c.next);
        System.out.println(d.next);
        System.out.println(e.next);*/

        //displaying linkedlist

    /* Node temp=a;
     while (temp!=null){
         System.out.println(temp.data);
         temp=temp.next;*/



     }

    }

