package tcs_nqt;
import java.util.*;

// You are given a sorted integer array 'arr' of size 'n'.

// You need to remove the duplicates from the array such that each element appears only once.

// Return the length of this new array.

// Note:
// Do not allocate extra space for another array. You need to do this by modifying the given input array in place with O(1) extra memory. 

// For example:
// 'n' = 5, 'arr' = [1 2 2 2 3].
// The new array will be [1 2 3].
// So our answer is 3.


public class tcs7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt(); 
        }
        sc.close();
        int res = removeDuplicates(arr, n);
        System.out.println(res);
        int res1 = removeDuplicates1(arr, n);
        System.out.println(res1);
    }

    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(arr[i]);
        }
        return set.size();
       
    }

    public static int removeDuplicates1(int[] arr,int n) {
        // Write your code here.
        int i = 0;
        for (int j = 1; j < n; j++) {
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
