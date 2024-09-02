package tcs_nqt;
import java.util.*;


// striver tcs sheet
// Given an array ‘arr’ of size ‘n’ find the largest element in the array.
// Example:

// Input: 'n' = 5, 'arr' = [1, 2, 3, 4, 5]

// Output: 5

// Explanation: From the array {1, 2, 3, 4, 5}, the largest element is 5.

public class tcs4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt(); 
        }
        sc.close();
        int a = largestElement(arr, n);
        int b = largestElement1(arr, n);
        System.out.println("maximum: "+a);
        System.out.println("maximum: "+b);
    }
    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    // TC - O(N)
    // SC - O(1)
    
    static int largestElement1(int[] arr, int n) {
        // Write your code here.
        
        Arrays.sort(arr);
        return arr[n-1];
    }
}
