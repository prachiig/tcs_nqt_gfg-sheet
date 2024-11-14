

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





// GFG
// class MyStack {
//     private int[] arr;
//     private int top;

//     public MyStack() {
//         arr = new int[1000];
//         top = -1;
//     }

//     public void push(int x) {
//         // Your Code
//         top++;
//         arr[top] = x;
        
//     }

//     public int pop() {
//         // Your Code
//         if(top == -1)
//             return -1;
//         int popy = arr[top];
//         top--;
//         return popy;
//     }
// }
// TC - O(1)
// SC - O(1)