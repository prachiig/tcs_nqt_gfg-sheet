package tcs_nqt;
import java.util.*;


// You are given a sorted array 'arr' of positive integers of size 'n'.

// It contains each number exactly twice except for one number, which occurs exactly once.

// Find the number that occurs exactly once.

// Example :
// Input: ‘arr’ = {1, 1, 2, 3, 3, 4, 4}.
// Output: 2

// Explanation: 1, 3, and 4 occur exactly twice. 2 occurs exactly once. Hence the answer is 2.


public class tcs18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt(); 
        }
        sc.close();
        int ans = getSingleElement(arr);
        System.out.println("single element: "+ans);
    }

    public static int getSingleElement(int []arr){
        // Write your code here.
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int val = map.getOrDefault(arr[i], 0);
            map.put(arr[i], val + 1);
        }

        //Find the single element and return the answer:
        for (Map.Entry<Integer, Integer> a : map.entrySet()) {
            if (a.getValue() == 1) {
                return a.getKey();
            }
        }

        //This line will never execute
        //if the array contains a single element.
        return -1;
    }
}
