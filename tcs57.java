import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


// You are given a stack St. You have to reverse the stack using recursion.
// Input:
// St = {3,2,1,7,6}
// Output:
// {6,7,1,2,3}


public class tcs57 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(4);
        s.add(5);
        s.add(7);
        reverse(s);
        System.out.println("after reversing");
        while(!s.empty()){
            System.out.println(s.pop());
        }
    }

    // TC - O(N*N)
    // SC - O(N)
    public static void reverse(Stack<Integer> s)
    {
        Queue<Integer> q = new LinkedList<>();
        while(!s.empty()){
            q.add(s.pop());
        }
        while(q.size() != 0){
            s.push(q.remove());
        }
    }
}
