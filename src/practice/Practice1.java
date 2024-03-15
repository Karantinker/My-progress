package practice;

public class Practice1 {
    public static void recursively(Node head){
      if(head==null)return;
      recursively(head.next);
        System.out.print(head.data+"->");
    }

    public static void displayy(Node head) {
        Node temp=head;

        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static int length(Node head ){
        int count=0;
        while(head !=null){
            count++;
            head=head.next;

        }
        return count;

    }

    public static class Node {
        int data;
        Node next;

        Node ( int data){
         this.data=data;
        }

        public static void main(String[] args) {
            Node a =new Node(8);
            Node b =new Node(5);
            Node c =new Node(4);
            Node d =new Node(9);
            Node e =new Node(6);
            Node f =new Node(0);
            //lets connect together
            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;
            e.next=f;
//            System.out.println(a.data);
//            System.out.println(b.data);
//            System.out.println(c.data);
//            System.out.println(c.next.data);
//            System.out.println(e.data);

            Node temp=a;
//            while( temp!=null){
//                System.out.print(temp.data+"->");
//                temp=temp.next;
//            }

            displayy(a);
            System.out.println();
            recursively(a);
            System.out.println();
            System.out.println(length(a));

        }

    }

}

