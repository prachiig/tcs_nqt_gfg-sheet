package tcs_nqt;
import java.util.*;


// Given a Doubly Linked List. Delete the last of a Doubly Linked List.


class Node{
    int data;
    Node next;
    Node prev;
    Node(int data1){
        data = data1;
        next = null;
        prev = null;
    }
    Node(int data2, Node next1, Node prev1){
        data = data2;
        next = next1;
        prev = prev1;
    }

}
public class tcs34 {
    public static void main(String[] args) {
        
        Node head = new Node(3);
        head.next = new Node(4);
        head.next.next = new Node(5);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(7);
        
        printList(head);
        Node newHead = deleteLastNode(head);
        printList(newHead);
       
        
    }


    public static Node deleteLastNode(Node head) {
        // Write your code here
        if(head == null || head.next == null)
            return null;
        Node ptr = head;
        while(ptr.next.next != null){
            ptr = ptr.next;
        }
        ptr.next = null;
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
