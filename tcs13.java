package tcs_nqt;
import java.util.*;

// You are given an array 'a' of 'n' integers.

// A majority element in the array ‘a’ is an element that appears more than 'n' / 2 times.

// Find the majority element of the array.

// It is guaranteed that the array 'a' always has a majority element.

// Example:
// Input: ‘n’ = 9, ‘a’ = [2, 2, 1, 3, 1, 1, 3, 1, 1]
// Output: 1


public class tcs13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt(); 
        }
        sc.close();
        int ans = majorityElement(arr);
        System.out.println(ans);
    }

    public static int majorityElement(int []v) {
        // Write your code here
        int n = v.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int  i = 0; i < n; i++){
            int val = map.getOrDefault(v[i], 0);
            map.put(v[i], val+1);
        }
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }
        return -1;
    }
}
