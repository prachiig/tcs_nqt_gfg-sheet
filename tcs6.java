package tcs_nqt;
import java.util.*;

// You have been given an array ‘a’ of ‘n’ non-negative integers.You have to check whether the given array is sorted in the non-decreasing order or not.

// Your task is to return 1 if the given array is sorted. Else, return 0.

// Example :
// Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
// Output: 1

public class tcs6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt(); 
        }
        sc.close();
        int res = isSorted(n, arr);
        if(res == 1)
            System.out.println("sorted array");
        else
            System.out.println("not sorted array");
    }

    // TC - O(N)
    // SC - O(1)
    public static int isSorted(int n, int []a) {
        // Write your code here.
        int flag = 0;
        for(int i = 0; i < n-1; i++){
            if(a[i] > a[i+1])
                flag = 1;
        }
        if(flag == 0) 
            return 1;
        else
            return 0;
    }
}
