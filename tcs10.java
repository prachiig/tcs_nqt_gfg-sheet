package tcs_nqt;
import java.util.*;

// Searching in sorted array

public class tcs10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt(); 
        }
        sc.close();
        int res = search(arr, n);
        if(res == -1)
            System.out.println("element not found");
        else
            System.out.println("element found");
    }

    public static int search(int []nums, int target) {
        // Write your code here.
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target)
                return i;
        }
        return -1;
    }
}
