
import java.util.*;

// Given a linked list of n nodes and a key , the task is to check if the key is present in the linked list or not.

// Input:
// n = 4
// 1->2->3->4
// Key = 3
// Output:
// True
// Explanation:
// 3 is present in Linked List, so the function returns true.

class Node {
    int data;
    Node next;
    Node(int newData){
        data = newData;
        next = null;
    }
}
public class tcs30{
    public static void main(String[] args) {
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

        boolean ans = searchKey(head, x);
        if(ans == false)
            System.out.println("not found");
        else
            System.out.println("found element");
    }

    public static void printList(Node head){
        while(head.next != null){
            System.out.println(head.data+" ");
            head = head.next;
        }
    }

    public static boolean searchKey(Node head, int key) {
        // Code here
        int flag = 0;
        if(head == null){
            return false;
        }
        else{
            Node ptr = head;
            while(ptr != null){
                if(ptr.data == key){
                    flag = 1;
                    break;
                }
                ptr = ptr.next;
            }
        }
        if(flag == 1)
            return true;
        else
            return false;
    }
}
