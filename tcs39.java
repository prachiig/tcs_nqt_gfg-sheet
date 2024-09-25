package tcs_nqt;

import java.util.Stack;

class MyQueue{
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();
    void push(int a){
        while(!input.empty()){
            output.push(input.peek());
            input.pop();
        }
        System.out.println("element pushed: ");
        input.push(a);
        while(!output.empty()){
            input.push(output.peek());
            output.pop();
        }
    }

    int pop(){
        if(input.empty()){
            System.out.println("empty satack, no elements");
        }
        int popy = input.peek();
        input.pop();
        return popy;
    }

    int top(){
        if(input.empty()){
            System.out.println("empty satack, no elements");
        }
        return input.peek();
    }

    int size(){
        return input.size();
    }
}
public class tcs39 {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(3);
        q.push(1);
        q.push(4);
        System.out.println(q.size());
        System.out.println(q.top());
        System.out.println(q.pop());
        System.out.println(q.size());
        System.out.println(q.top());
        System.out.println(q.pop());
        System.out.println(q.size());
    }
}
