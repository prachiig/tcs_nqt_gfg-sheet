package tcs_nqt;
import java.util.*;

// You are given an array 'arr' sorted in non-decreasing order and a number 'x'. You must return the index of the lower bound of 'x'.

// Note:
// 1. For a sorted array 'arr', 'lower_bound' of a number 'x' is defined as the smallest index 'idx' such that the value 'arr[idx]' is not less than 'x'.If all numbers are smaller than 'x', then 'n' should be the 'lower_bound' of 'x', where 'n' is the size of array.

// 2. Try to do this in O(log(n)).

// Example:
// Input: ‘arr’ = [1, 2, 2, 3] and 'x' = 0

// Output: 0

// Explanation: Index '0' is the smallest index such that 'arr[0]' is not less than 'x'.

public class tcs14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();        
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt(); 
        }
        sc.close();
        int ans = lowerBound(arr, n, x);
        System.out.println("lower bound: "+ans);
        int ansBS = lowerBoundBS(arr, n, x);
        System.out.println("lower bound BS: "+ans);
    }


    // TC - O(N)
    // SC - O(1)
    public static int lowerBound(int []arr, int n, int x) {
        // Write your code here
        for(int i = 0; i < n; i++){
            if(arr[i]>=x){
                return i;
            }
        }
        return n;
    }
    public static int lowerBoundBS(int []arr, int n, int x) {
        // Write your code here
        int s = 0;
        int e = n-1;
        int mid;
        int ans = n;
        while(s <= e){
            mid = s + (e - s) / 2;
            if(arr[mid] < x){
                s = mid+1;
            }
            else if(arr[mid] >= x){
                ans = mid;
                e = mid-1;
            }
        }
        return ans;
    }
}
