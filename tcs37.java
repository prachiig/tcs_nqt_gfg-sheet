// Implement Queue Data Structure using Array with all functions like pop, push, top, size, etc.


// TC - 0(1)
// SC - 0(N)

class queue{
    int size = 100;
    int[] arr;
    int start, end, currsize;

    public queue(int size){
        this.size = size;
        arr = new int[size];
        start = -1;
        end = -1;
        currsize = 0;
    }
    void push(int a){
        if(currsize == size){
            System.out.println("queue full\n exiting");
            System.exit(1);
        }
        if(end == -1){
            start = 0;
            end = 0;
        }
        else{
            end = (end+1) % size;
        }
        arr[end] = a;
        System.out.println("Element pushed is: " + a);
        currsize++;
    }
    int pop(){
        if(start == -1){
            System.out.println("Queue is empty\nExiting");
            System.exit(1);
        }
        int popy = arr[start];
        if(currsize == 1){
            start = -1;
            end = -1;
        }
        else{
            start = (start + 1) % size;
        }
        currsize--;
        return popy;
    }
    int top(){
        if(start == -1){
            System.out.println("Queue is empty\nExiting");
            System.exit(1);
        }
        return arr[start];
    }
    int size(){
        return currsize;
    }
}
public class tcs37 {
    public static void main(String[] args) {
        queue q = new queue(10);
        q.push(6);
        q.push(3);
        q.push(7);
        System.out.println(q.size());
        System.out.println(q.top());
        System.out.println(q.pop());
        System.out.println(q.size());
        System.out.println(q.top());
        System.out.println(q.pop());
        System.out.println(q.size());
    }
}



// TC - O(1)
// SC - O(1)
class MyQueue {

    int front, rear;
	int arr[] = new int[100005];

    MyQueue()
	{
		front=0;
		rear=0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    // Your code here
	    arr[rear] = x;
	    rear++;
	    
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
		// Your code here
		if(front == rear)
		    return -1;
		int popy = arr[front];
		front++;
		return popy;
	} 
}