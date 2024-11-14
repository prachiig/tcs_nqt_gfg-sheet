
import java.util.*;

class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
	    this.data = data;
	    next = prev = null;
	}
}
public class tcs31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        int data = sc.nextInt();
        sc.close();
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(6);

        System.out.print("Created Linked list is:");
        printList(head);

        addNode(head, pos, data);
        
    }

    public static void printList(Node head){
        while(head.next != null){
            System.out.println(head.data+" ");
            head = head.next;
        }
    }

    public static void addNode(Node head_ref, int pos, int data)
	{
		Node newNode = new Node(data);
		int cnt = 0;
		Node ptr = head_ref;
		while(cnt != pos){
		    ptr = ptr.next;
		    cnt++;
		}
		newNode.next = ptr.next;
        if(ptr.next != null){
            ptr.next.prev = newNode;
        }
		ptr.next = newNode;
		newNode.prev = ptr;
		printList(head_ref);
	}
}
