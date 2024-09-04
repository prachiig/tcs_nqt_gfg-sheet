package tcs_nqt;
import java.util.*;

// You are given an array 'a' of size 'n' and an integer 'k'.

// Find the length of the longest subarray of 'a' whose sum is equal to 'k'.

// Example :
// Input: ‘n’ = 7 ‘k’ = 3
// ‘a’ = [1, 2, 3, 1, 1, 1, 1]
// Output: 3

// Explanation: Subarrays whose sum = ‘3’ are:
// [1, 2], [3], [1, 1, 1] and [1, 1, 1]


public class tcs19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt(); 
        }
        sc.close();
        int ans = longestSubarrayWithSumK(arr, k);
        System.out.println("longest subarray with target sum k: "+ans);
        int ans_2loop = longestSubarrayWithSumK_2loop(arr, k);
        System.out.println("longest subarray with target sum k: "+ans_2loop);
    }


    // TC - O(N*N*N)
    // SC - O(1)

    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int n = a.length;
        int len = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                long sum = 0;
                for(int m = i; m <= j; m++){
                    sum = sum + a[m];
                }
                if(sum == k)
                    len = Math.max(len, j-i+1);
            }
        }
        return len;
    }

    // TC - O(N*N)
    // SC - O(1)

    public static int longestSubarrayWithSumK_2loop(int []a, long k) {
        // Write your code here
        int n = a.length;
        int len = 0;
        for(int i = 0; i < n; i++){
            long sum = 0;
            for(int j = i; j < n; j++){
                sum = sum + a[j];
                if(sum == k)
                    len = Math.max(len, j-i+1);
            }
        }
        return len;
    }
}
