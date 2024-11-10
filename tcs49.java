package tcs_nqt;


class Node{
    int data;
    Node left;
    Node right;
    Node(int data1){
        data = data1;
        left = null;
        right = null;
    }
}
public class tcs49 {
    public static int minValue(Node root){
        if(root == null)    return -1;

        Node curr = root;
        while(curr.left != null){
            curr = curr.left;
        }

        return curr.data;
    }
    
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.left.left = new Node(1);
        root.right = new Node(7);
        root.right.right = new Node(9);
        System.out.println("Minimum value of element is: " + minValue(root));
    }
}
