package practice;

public class practice2 {

    public static class Node {
        int data ;
        Node next;
        Node (int data ){
            this .data =data;
        }
        public static class linklisttttt{

            Node head=null;
            Node tail=null;
           void insertAtEnd(int val){
               Node temp=new Node(val);
               if ( head==null){
                   head=temp;
                   tail=temp;
               }
               else{
                   tail.next=temp;
               }
               tail=temp;
           }
           void displayy(){
               Node temp=head;
               while(temp!=null){
                   System.out.println(temp.data+" ");
                   temp=temp.next;
               }


           }
           int size(){
               Node temp=head;
               int count=0;
               while (temp!=null){
                   count++;
                   temp=temp.next;

               }
               return count;
           }

            public static void main(String[] args) {
                linklisttttt ll= new linklisttttt();
                ll.insertAtEnd(1);
                ll.insertAtEnd(2);
                ll.insertAtEnd(3);
                ll.insertAtEnd(9);
                ll.insertAtEnd(10);
                ll.displayy();
                System.out.println(ll.size());

            }
        }

    }
}
