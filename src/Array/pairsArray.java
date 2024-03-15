package Array;

public class pairsArray {
    //using nested loops
    public static void printPairs(int numbers[]){
        for(int i=0;i<numbers.length;i++) {
            int curr = numbers[i];
            for (int j = i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")" );
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[]= {4,8,12,16,20};
        printPairs(numbers);
    }
}
