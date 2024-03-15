import java.util.ArrayList;

public class Karan {
public static void main(String[]args){

    ArrayList<Integer> list= new ArrayList<>();

    //add element
   list.add(0);
    list.add(1);
    list.add(3);

    System.out.println(list);
    //get element
    int element=list.get(2);
    System.out.println(element);
    //add element in between

   list.add(2,2);
    System.out.println(list);

    // set element

    list.set(0,4);
    System.out.println(list);

//delete element

list.remove(0);
    System.out.println(list);
// size of list

   int size= list.size();
    System.out.println(size);

   //loops
   for(int i=0;i<list.size();i++){

       System.out.print(list.get(i));

   }
    System.out.println();

   //sorting


}

}
