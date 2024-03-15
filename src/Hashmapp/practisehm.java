package Hashmapp;
import java .util.*;
import java.util.LinkedList;

public class practisehm {
    static class hashmappcode<K,V>{
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;

            }
        }
            private int n;
            private int N;
            private LinkedList<Node> buckett[];
            public hashmappcode(){
                this.n=4;
                this.buckett = new LinkedList[4];
                for (int i =0;i<4; i++){
                    this.buckett[i]= new LinkedList<>();
                }
            }

            private int hashfunction(K key){
                int hc =key.hashCode();
                return Math.abs(hc)%N;
            }
            private int searchInll(K key, int bi){
                LinkedList<Node> ll= buckett[bi];
                int di=0;
                for(int i=0;i<ll.size();i++){
                    Node node= ll.get(i);
                    if (node.key==key){
                        return di;
                    }
                    di++;
                }
                return -1;
            }
            public void put(K key,V value){
                int bi=hashfunction(key);
                int di= searchInll(key,bi);
                if (di!=-1){
                    Node node = buckett[bi].get(di);
                    node.value=value;
                }
                else {
                    buckett[bi].add(new Node(key,value));
                    n++;
                }
            }
    }

}
