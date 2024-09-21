package tcs_nqt;
import java.util.*;

// Implementation of stack using array
// TC - O(N)
// SC - O(N)
class stack{
    int size = 100;
    int[] arr = new int[size];
    int top = -1;
    void push(int a){
        top++;
        arr[top] = a;
    }
    int pop(){
        int popy = arr[top];
        top--;
        return popy;
    }
    int top(){
        return arr[top];
    }
    int size(){
        return top + 1;
    }
}
public class tcs36 {
    public static void main(String[] args) {
        stack s = new stack();
        s.push(6);
        s.push(3);
        s.push(7);
        System.out.println(s.size());
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.top());
        System.out.println(s.pop());


    }
}
