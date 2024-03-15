package Array;
import java.util.*;

public class basics {
    public static void main(String[] args) {
        int marks[]=new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0]= sc.nextInt();//physics
        marks[1]= sc.nextInt();//chemistry
        marks[2]= sc.nextInt();//math

        System.out.println("physics:"+marks[0]);
        System.out.println("chemistry:"+marks[1]);
        System.out.println("math:"+marks[2]);
        int average=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage:"+average+"%");
        //length of an array
        System.out.println("length:"+marks.length);
    }

}


