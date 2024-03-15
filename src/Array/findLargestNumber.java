package Array;
import java.util.*;

public class findLargestNumber{
     public static int getLargest(int number[]){
         int largest= Integer.MIN_VALUE;//-infinity
         int smallest= Integer.MAX_VALUE;//+infinity
         for(int i=0;i<number.length;i++){
              if(largest<number[i]){
                  largest=number[i];
              }
              if(smallest>number[i]){
                  smallest=number[i];
              }

         }
         System.out.println("the smallest number given by you is:"+smallest);
         return largest;
     }

    public static void main(String[] args) {
        int number[]={5,2,3,8,5,815,2,11,1,21241};
        System.out.println("largest number given by you:"+getLargest(number));

    }

  }


