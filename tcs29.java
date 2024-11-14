// Given a singly linked list. The task is to find the length of the linked list, where length is defined as the number of nodes in the linked list.
// Input: LinkedList : 1->2->3->4->5
// Output: 5
// Explanation: Count of nodes in the linked list is 5, which is its length.


class Node {
    int data;
    Node next;
    Node(int newData){
        data = newData;
        next = null;
    }
}
public class tcs29 {
    public static void main(String[] args) {
        
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(6);

        System.out.print("Created Linked list is:");
        printList(head);

        int count = getCount(head);
        System.out.print("Count of the number of nodes in linked list: "+ count);
        
    }

    public static int getCount(Node head) {
        // code here
        int count = 0;
        if(head == null){
            return count;
        }
        else{
            Node ptr = head;
            while(ptr != null){
                ptr = ptr.next;
                count++;
            }
        }
        return count;
    }

    public static void printList(Node newNode){
        while(newNode != null){
            System.out.println(newNode.data+" ");
            newNode = newNode.next;
        }
    }
}
