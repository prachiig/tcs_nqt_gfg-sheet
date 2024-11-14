import java.util.*;


// You are given a sorted array ‘arr’ containing ‘n’ integers and an integer ‘x’.
// Implement the ‘upper bound’ function to find the index of the upper bound of 'x' in the array.

// Note:
// 1. The upper bound in a sorted array is the index of the first value that is greater than a given value. 
// 2. If the greater value does not exist then the answer is 'n', Where 'n' is the size of the array.
// 3. Try to write a solution that runs in log(n) time complexity.

// Example:

// Input : ‘arr’ = {2,4,6,7} and ‘x’ = 5,
// Output: 2

// Explanation: The upper bound of 5 is 6 in the given array, which is at index 2 (0-indexed).


public class tcs15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();        
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt(); 
        }
        sc.close();
        int ans = upperBound(arr, x, n);
        System.out.println("lower bound: "+ans);
        int ansBS = upperBoundBS(arr, x, n);
        System.out.println("lower bound BS: "+ansBS);
    }


    // TC - O(N)
    // SC - O(1)

    public static int upperBound(int []arr, int x, int n){
        // Write your code here.
        for(int i = 0; i < n; i++){
            if(arr[i] > x)
                return i;
        }
        return n;
    }


    // TC - O(logN)
    // SC - O(1)

    public static int upperBoundBS(int []arr, int x, int n){
        // Write your code here.
        int s = 0;
        int e = n-1;
        int mid;
        int ans = n;
        while(s <= e){
            mid = s + (e - s) / 2;
            if(arr[mid] <= x){
                s = mid + 1;
            }
            else{
                ans = mid;
                e = mid - 1;
            }
        }
        return ans;
    }
}
