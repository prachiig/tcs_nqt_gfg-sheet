// Given a Doubly Linked List. Delete the last of a Doubly Linked List.
// A doubly-linked list is a data structure that consists of sequentially linked nodes, and the nodes have reference to both the previous and the next nodes in the sequence of nodes.

// Given a doubly-linked list, delete the node at the end of the doubly linked list.

// Note:
// You need not print anything. You’re given the head of the linked list, just return the head of the modified list.
// Sample Input 1:
// 5
// 4 10 3 5 20


// Sample Output 1:
// 4 10 3 5 NULL


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
