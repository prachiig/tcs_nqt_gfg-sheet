package tcs_nqt;
// https://www.geeksforgeeks.org/problems/non-repeating-element3958/1

// Find the first non-repeating element in a given array arr of integers and if there is not present any non-repeating element then return 0
// Note: The array consists of only positive and negative integers and not zero.
// Input: arr[] = [-1, 2, -1, 3, 2]
// Output: 3
// Explanation: -1 and 2 are repeating whereas 3 is the only number occuring once. Hence, the output is 3. 


import java.util.*;

class tcs1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt(); 
        }
        sc.close();
        int a = firstNonRepeating(arr);
        System.out.println(a);
    }
    public static int firstNonRepeating(int[] arr) {
        // Complete the function
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(map.get(arr[i])==1){
                return arr[i];
            }
        }
        return 0;      
    }
}