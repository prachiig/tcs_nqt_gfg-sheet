import java.util.*;


// Given a stack, the task is to sort it such that the top of the stack has the greatest element.
// Input:
// Stack: 11 2 32 3 41
// Output: 41 32 11 3 2


public class tcs58 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(7);
        s.push(1);
        s.push(10);
        s.push(5);
        s.push(3);
        s.push(99);
        s.push(111);
        s.push(6);
        System.out.println(sortStack(s));
    }

    // TC - O(N*N) - 2 loop iterations
    // SC - O(N) - stack space
    public static Stack<Integer> sortStack(Stack<Integer> s){

        Stack<Integer> st1 = new Stack<>();
        while(!s.empty()){
            int temp = s.pop();
            while(!st1.empty() && temp < st1.peek()){
                s.push(st1.pop());
            }
            st1.push(temp);
        }

        return st1;
    }
}
