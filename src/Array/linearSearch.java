package Array;

public class linearSearch {
    public static int linearsearch(int numbers[],int key){
        for (int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
       return -1;
    }

    public static void main(String[] args) {
        int numbers[]={22,8,25,63,21,74,96};
        int key=74;
        int index=linearsearch(numbers,key);
        if(index==-1){
            System.out.println("key NOT FOUND");
        }
        else{
            System.out.println("key is at index:"+index);
        }
    }
}
