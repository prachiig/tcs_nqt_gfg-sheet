package tcs_nqt;
import java.util.*;


// Problem Statement: Given a doubly linked list, and a value ‘k’, insert a node having value ‘k’ at the end of the doubly linked list.
// Example 1:

// Input Format:

// DLL: 1 <-> 2 <-> 3 <-> 4

// Value to be Inserted: 6
// Result: DLL: 1 <-> 2 <-> 3 <-> 4 <-> 6


class Node{
    int data;
    Node next;
    Node prev;
    Node(int newData){
        data = newData;
        next = null;
        prev = null;
    }
    Node(int Data, Node forw, Node back){
        data = Data;
        forw = next;
        back = prev;
    }
}
public class tcs33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(3);
        head.next = new Node(4);
        head.next.next = new Node(5);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(7);
        int data = 8;
        printList(head);
        Node newHead = insertNode(head, data);
        printList(newHead);
       
        sc.close();
    }

    public static Node insertNode(Node head, int data){
        
        if(head == null)
            return null;
        Node ptr = head;
        while(ptr.next != null){
            ptr = ptr.next;
        }
        Node temp = new Node(data);
        temp.next = null;
        ptr.next = temp;
        temp.prev = ptr;
        return head;
    }

    public static void printList(Node head){
        while(head != null){
            System.out.print(head.data +" ");
            head = head.next;
        }
        System.out.println();
    }
}
