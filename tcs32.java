package tcs_nqt;

import java.util.*;

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
        printList(head);
        Node newHead = deleteNode(head);
        printList(newHead);
    }

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
}
