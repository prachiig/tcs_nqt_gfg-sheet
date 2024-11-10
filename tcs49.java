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

    // TC - O(h) - h = height of BST  worst case complexity = O(n)
    // SC - O(1) - no stack space
    public static int minValue1(Node root){
        if(root == null)    return -1;

        Node curr = root;
        while(curr.left != null){
            curr = curr.left;
        }

        return curr.data;
    }

    // TC - O(h) - h = height of BST  worst case complexity = O(n)
    // SC - 0(h) - stack space
    public static int minValue2(Node root){
        if(root == null || root.left == null)  return root.data;

        return minValue2(root.left);
    }
    
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.left.left = new Node(1);
        root.right = new Node(7);
        root.right.right = new Node(9);
        System.out.println("Minimum value of element is: " + minValue1(root));
        System.out.println("Minimum value of element is: " + minValue2(root) + " with recursion");
    }
}
