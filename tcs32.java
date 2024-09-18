package tcs_nqt;

import java.util.*;


// There is a singly-linked list head and we want to delete a node node in it.

// You are given the node to be deleted node. You will not be given access to the first node of head.

// All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.

// Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:

// The value of the given node should not exist in the linked list.
// The number of nodes in the linked list should decrease by one.
// All the values before node should be in the same order.
// All the values after node should be in the same order.
// Custom testing:

// For the input, you should provide the entire linked list head and the node to be given node. node should not be the last node of the list and should be an actual node in the list.
// We will build the linked list and pass the node to your function.
// The output will be the entire list after calling your function.

// Input: head = [4,5,1,9], node = 5
// Output: [4,1,9]
// Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.


class Node{
    int data;
    Node next;
    Node(int newData){
        data = newData;
        next = null;
    }
}
public class tcs32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(3);
        head.next = new Node(4);
        head.next.next = new Node(5);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(7);
        printList(head);
        Node newHead = deleteNode(head);
        printList(newHead);
        deleteNode2(head.next);
        printList(head);
    }

    // Deleting a random node
    public static Node deleteNode(Node head){
        if(head == null || head.next == null){
            return null;
        }

        Node ptr = head;
        while(ptr.next.next != null){
            ptr = ptr.next;
        }
        ptr.next = null;

        return head;
    }

    public static void printList(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    // if given node is to be deleted according to the PS
    public static void deleteNode2(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }
   
}
