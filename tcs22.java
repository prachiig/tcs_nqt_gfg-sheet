package tcs_nqt;
import java.util.*;

// You are given an array 'arr' of length 'n', consisting of integers.
// A subarray is a contiguous segment of an array. 
// In other words, a subarray can be formed by removing 0 or more integers from the beginning and 0 or more integers from the end of an array.
// Find the sum of the subarray (including empty subarray) having maximum sum among all subarrays.

// The sum of an empty subarray is 0.

// Example :
// Input: 'arr' = [1, 2, 7, -4, 3, 2, -10, 9, 1]

// Output: 11

public class tcs22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt(); 
        }    
        sc.close();
        long ans = maxSubarraySum(arr, n);
        System.out.println("maximum subarray sum: "+ans);
    }


    public static long maxSubarraySum(int[] arr, int n) {
		long sum = 0;
		long max = Long.MIN_VALUE;
		for(int i = 0; i < n; i++){
			sum = sum + arr[i];
			if(sum < 0)
				sum = 0;
			if(sum > max)
				max = sum;
		}
		return max;
	}
}
