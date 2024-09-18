package tcs_nqt;


// Given a singly linked list of 'N' nodes. The objective is to determine the middle node of a singly linked list. 
// However, if the list has an even number of nodes, we return the second middle node.
// Sample Input 1 :
// 5
// 1 2 3 4 5
// Sample Output 1 :
// 3 4 5


class Node{
    int data;
    Node next;
    Node(int newdata){
        data = newdata;
        next = null;
    }
}

public class tcs35 {
    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(4);
        head.next.next = new Node(5);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(7);
        
        printList(head);
        Node newHead = findMiddle(head);
        printList(newHead);
    }

    public static void printList(Node head){
        while(head != null){
            System.out.print(head.data +" ");
            head = head.next;
        }
        System.out.println();
    }

    // TC - O(N + N/2)
    // SC - O(1)
    public static Node findMiddle(Node head)
    {
        // Write your code here.
        int count = 0;
        Node ptr = head;
        while(ptr != null){
            ptr = ptr.next;
            count++;
        }
        
        int i = 0;
        Node temp = head;
        while(i < count/2){
            temp = temp.next;
            i++;
        }
        return temp;
    }
}
