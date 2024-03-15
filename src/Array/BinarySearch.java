package Array;

public class BinarySearch {
//for better time complexity

    public static int BinarySearchh(int numbers[],int key){
        int start=0,end=numbers.length-1;
        while(start<=end){
            int mid=(start + end)/2;
            //comparison
            if(numbers[mid]==key){
                return mid;
            }
            if (numbers[mid]<key){
                start = mid +1;
            }
            else{
                start=mid -1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int numbers[]={52,0,321,541,1,2,9,44,75};
        int key=9;
        System.out.println("index of key is :"+BinarySearchh(numbers,key));
    }
}
