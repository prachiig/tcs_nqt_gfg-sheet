package tcs_nqt;
import java.util.*;

// Searching in sorted array
// Linear search and binary search implementation

public class tcs10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt(); 
        }
        sc.close();
        int res = linearsearch(arr, target);
        if(res == -1)
            System.out.println("element not found");
        else
            System.out.println("element found at : "+res);
        int ans = binarysearch(arr, target);
        if(ans == -1)
            System.out.println("element not found in BS");
        else
            System.out.println("element found in BS at: "+ans);
    }

    public static int binarysearch(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(mid > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static int linearsearch(int []nums, int target) {
        // Write your code here.
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target)
                return i;
        }
        return -1;
    }
}
