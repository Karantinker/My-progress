package linklist;

public class kataibasics {
    public static void displayr(Node head){//recursion
       if (head==null)return;//base case
        displayr(head.next);
        System.out.print(head.data+" ");

    }
    public static void displayy(Node head){
        //ham sirf head ko leke he poori list print kar denge
        Node temp=head;//aur temp already connected hai hamare x se niche ke code mai
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }

    public static int length(Node head){
        int count=0;
        while (head !=null){
            count++;
            head=head.next;
        }
        return count;
    }

    public static class Node{

        int data;// this 2 properies always
        Node next;
        Node(int data){

            this.data=data;
        }
    }

    public static void main(String[] args) {

        Node x = new Node(2);// head node//iska by default next null tha lekin
                                  //linklist mai sb connected hone chaiye isliy iske baad sbko connected karna hai
        Node y= new Node(6);
        Node z = new Node(9);
        Node a = new Node(3);
        Node b = new Node(1);
        Node c = new Node(5);
        // now we want ke ye aapas mai connected rahe
        x.next=y;
        y.next=z;
        z.next=a;
        a.next=b;
        b.next=c;
//        System.out.println(x.data);//abb ham ye ni chate ki hame baar ye sout statement likhna pade
//        System.out.println(x.next.data);//isliy ham abb loop use karenge
//        System.out.println(y.next.data);
//        System.out.println(x.next.next.next.data);//<- iska mtlb x ka next y ka next data ko print karana hai

        //ab ham head ko ek name de denge temp taki vo aage jaata rahe
        //or hamara head x hai
         Node temp=x;
//        for (int i=1;i<=5;i++){
//            System.out.print(temp.data+"->");
//            //abb aage jaate rehne ke liy
//            temp=temp.next;//meaning of this temp=b
//        }
        //abb ham while loop use krenge taki loop rukk jaaye temp null hote he
        //can we do this recursively????lets try and make a function of display()
        displayy(x);
        System.out.println();
        displayr(x);
        System.out.println(length(x));

    }

}
