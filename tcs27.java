package tcs_nqt;
import java.util.*;


// There is a Binary Search Tree (BST) consisting of ‘N’ nodes. Each node of this BST has some integer data.
// You are given the root node of this BST, and an integer ‘X’. Return true if there is a node in BST having data equal to ‘X’, otherwise return false.
// A binary search tree (BST) is a binary tree data structure that has the following properties:

// 1. The left subtree of a node contains only nodes with data less than the node’s data.
// 2. The right subtree of a node contains only nodes with data greater than the node’s data.
// 3. The left and right subtrees must also be binary search trees.
// Note:
// It is guaranteed that all nodes have distinct data.
// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input 1:
// 7 8
// 4 2 6 1 3 5 7 -1 -1 -1 -1 -1 -1 -1 -1
// Sample Output 1:
// False
// Explanation For Sample Input 1:
// There is no node having data 8. See the problem statement for the picture of this BST.


class TreeNode {
    // Value of the node
    int val;
    
    // Pointer to the left child node
    TreeNode left;
    
    // Pointer to the right child node
    TreeNode right;

    // Constructor to initialize the node with a
    // value and set left and right pointers to null
    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

class Solution {
    // This function searches for a node with
    // a specified value in a Binary Search Tree (BST).
    public boolean searchBST(TreeNode root, int val) {
        // Loop until either the tree is
        // exhausted (null) or the value is found.
        while (root != null) {
            if(root.val == val)
                return true;
            else if(root.val > val)
                root = root.left;
            else
                root = root.right;
        }
        return false;
    }
}

public class tcs27 {
    // Function to perform an in-order traversal
    // of a binary tree and print its nodes
    public static void printInOrder(TreeNode root) {
        // Check if the current node
        // is null (base case for recursion)
        if (root == null) {
            // If null, return and
            // terminate the function
            return;
        }

        // Recursively call printInOrder
        // for the left subtree
        printInOrder(root.left);

        // Print the value of the current node
        System.out.print(root.val + " ");

        // Recursively call printInOrder
        // for the right subtree
        printInOrder(root.right);
    }

    public static void main(String[] args) {
        // Creating a BST
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(10);
        
        System.out.println("Binary Search Tree: ");
        printInOrder(root);
        System.out.println();

        Solution solution = new Solution();
        
        // Searching for a value in the BST
        int target = 6;
        boolean result = solution.searchBST(root, target);

        // Displaying the search result
        if (result != false) {
            System.out.println("Value " + target + " found in the BST!");
        } else {
            System.out.println("Value " + target + " not found in the BST.");
        }
    }
}
                            
                        
