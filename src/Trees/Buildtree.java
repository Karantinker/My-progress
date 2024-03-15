package Trees;
import java.util.*;

public class Buildtree {
    static class Node{
        int data ;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Binarytree{
        static int idx=-1;
        public static Node Builttree(int nodes[]){
            idx++;
            if (nodes[idx]==-1){
                return null;
            }
            Node newNode =new Node(nodes[idx]);
            newNode.left=Builttree(nodes);
            newNode.right=Builttree(nodes);
            return newNode;
        }
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree= new Binarytree();
        Node root = tree.Builttree(nodes);

        System.out.println(root.data);
    }
}
