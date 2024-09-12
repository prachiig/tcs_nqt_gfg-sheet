package tcs_nqt;
import java.util.*;


// Given the head of a Singly Linked List and a value x, insert that value x at the end of the LinkedList and return the modified Linked List.
// Input: LinkedList: 1->2->3->4->5 , x = 6
// Output: 1->2->3->4->5->6

class Node {
    int data;
    Node next;

    Node(int newData) {
        data = newData;
        next = null;
    }
}

public class tcs28 {
    public static void main(String[] args) {
        // Create a hard-coded linked list:
        // 2 -> 3 -> 4 -> 5 -> 6
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(6);

        System.out.print("Created Linked list is:");
        printList(head);

        Node newNode = insertatEnd(head, x);
        System.out.print("\nAfter inserting 1 at the end:");
        printList(newNode);
    }
    public static Node insertatEnd(Node head, int x){
        Node newNode = new Node(x);
        if(head == null)
            return newNode;
        else{
            Node ptr = head;
            while(ptr.next != null){
                ptr = ptr.next;
            }
            ptr.next = newNode;
            newNode.next = null;
        }
        return head;
    }
    public static void printList(Node root) {
        while (root != null) {
            System.out.println(root.data + " ");
            root = root.next;
        }
    }
}