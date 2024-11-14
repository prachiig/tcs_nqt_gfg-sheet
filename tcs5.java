package tcs_nqt;

import java.util.*;

// You have been given an array ‘a’ of ‘n’ unique non-negative integers.

// Find the second largest and second smallest element from the array.

// Return the two elements (second largest and second smallest) as another array of size 2.

// Example :
// Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
// Output: [4, 2]

// The second largest element after 5 is 4, and the second smallest element after 1 is 2.

public class tcs5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt(); 
        }
        sc.close();
        int[] res = getSecondOrderElements(n, arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int[] arr = new int[2];
        if(n == 0 || n == 1){
            arr[0] = -1;
            arr[1] = -1;
            return arr;
        }
        else{
            Arrays.sort(a);
            // int[] arr = new int[2];
            arr[0] = a[n-2];
            arr[1] = a[1];
            return arr;
        }
    }
    // TC - O(NlogN)
    // SC - O(1)
}
