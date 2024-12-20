import java.util.LinkedList;
import java.util.Queue;



// Implement a Stack using a single Queue.

// TC - O(N)
// SC - O(N)

class stack{
    Queue <Integer> q = new LinkedList<>();
    void push(int a){
        q.add(a);
        for(int i = 0; i < q.size() - 1; i++){
            q.add(q.remove());
        }
    }
    int pop(){
        return q.remove();
    }
    int top(){
        return q.peek();
    }
    int size(){
        return q.size();
    }
}
public class tcs38 {
    public static void main(String[] args) {
        stack s= new stack();
        s.push(3);
        s.push(2);
        s.push(4);
        s.push(1);
        System.out.println(s.size());
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.top());
        System.out.println(s.pop());
    }
}
