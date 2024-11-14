import java.util.*;


// Given an array 'arr' of 'n' non-negative integers, your task is to move all the zeros to the end of the array while keeping the non-zero elements at the start of the array in their original order. Return the modified array.

// Example :
// Input: ‘n’ = 5, ‘arr’ = [1, 2, 0, 0, 2, 3]
// Output: [1, 2, 2, 3, 0, 0]

// Explanation: Moved all the 0’s to the end of an array, and the rest of the elements retain the order at the start.

public class tcs21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt(); 
        }    
        sc.close();
        System.out.println(Arrays.toString(moveZeros(n, arr)));
    }

    public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        int count = 0;
        for(int i = 0; i < n; i++){
            if(a[i] != 0)
                a[count++] = a[i];
        }
        for(int i = count; i < n ; i++){
            a[i] = 0;
        }
        return a;
    }
}
