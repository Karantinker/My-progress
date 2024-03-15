package Hashmapp;
import java.util.*;
public class CreatingHM {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();

        //putting- O(1)
        hm.put("india",133);
        hm.put("pakistan",20);
        hm.put("bangladesh",100);
        hm.put("china",800);
        System.out.println(hm);
        //get-O(1)operation
       int population= hm.get("india");
        System.out.println(population);
        //for null
        System.out.println(hm.get("america"));
        //containsKey
        System.out.println(hm.containsKey("antarctic"));//key exist or not
        //remove opertion
        System.out.println(hm.remove("china"));
        System.out.println(hm);
    }

}
