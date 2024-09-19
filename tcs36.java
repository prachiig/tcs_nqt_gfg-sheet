package tcs_nqt;


class Node{
    int data;
    Node next;
    Node(int data1){
        data = data1;
        next = null;
    }
}
public class tcs36 {
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
    
    public static Node findMiddle(Node head)
    {
        // Write your code here.
        Node slow = head;
        Node fast = head;
        if(head.next == null)
            return head;
        while(fast != null && slow != null){
            if(fast.next == null)
                return slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void printList(Node head){
        while(head != null){
            System.out.print(head.data +" ");
            head = head.next;
        }
        System.out.println();
    }
}
