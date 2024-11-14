import java.util.*;

// You are given a sorted array 'arr' of distinct values and a target value 'm'. You need to search for the index of the target value in the array.

// Note:
// 1. If the value is present in the array, return its index.
// 2. If the value is absent, determine the index where it would be inserted in the array while maintaining the sorted order. 
// 3. The given array has distinct integers.
// 4. The given array may be empty.

// Example:
// Input:  arr = [1, 2, 4, 7],  m = 6 
// Output: 3

// Explanation: If the given array 'arr' is: [1, 2, 4, 7] and m = 6. We insert m = 6 in the array and get 'arr' as: [1, 2, 4, 6, 7]. 
// The position of 6 is 3 (according to 0-based indexing)

public class tcs16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();        
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt(); 
        }
        sc.close();
        int ans = searchInsert(arr, x);
        System.out.println("search index to insert: "+ans);
    }


    // TC - O(log N)
    // SC - O(1)
    public static int searchInsert(int [] arr, int m){
        // Write your code here.
        int s = 0;
        int n = arr.length;
        if(n == 0)
            return n;
        
        int e = n - 1;
        int mid;
        int ans = n;
        while(s <= e){
            mid = s + (e-s)/2;
            if(arr[mid] == m)
                return mid;
            if(arr[mid] < m){
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
