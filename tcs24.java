import java.util.*;

// There is an array ‘A’ of size ‘N’ with an equal number of positive and negative elements.
// Without altering the relative order of positive and negative numbers, you must return an array of alternative positive and negative values.

// Note:
// Start the array with a positive number. 
// For example

// Input:
// A = [1, 2, -4, -5], N = 4
// Output:
// 1 -4  2 -5
// Explanation: 
// Positive elements = 1, 2
// Negative elements = -4, -5
// To maintain relative ordering, 1 must occur before 2, and -4 must occur before -5.

public class tcs24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt(); 
        }    
        sc.close();
        System.out.println(Arrays.toString(alternateNumbers(arr)));
    }


    // TC - O(N)
    // SC - O(1)
    public static int[] alternateNumbers(int []a) {
        // Write your code here.
        int n = a.length;
        int arr[] = new int[n];
        int countpos = 0;
        int countneg = 1;
        for(int i = 0; i < n; i++){
            if(a[i] >= 0){
                arr[countpos] = a[i];
                countpos+=2;
            }
            else if(a[i] < 0){
                arr[countneg] = a[i];
                countneg+=2;
            }
        }
        return arr;
    }


    // There’s an array ‘A’ of size ‘N’ with positive and negative elements (not necessarily equal). 
    // Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values. 
    // The leftover elements should be placed at the very end in the same order as in array A.
    // Input:
    // arr[] = {1,2,-4,-5,3,4}, N = 6
    // Output:
    // 1 -4 2 -5 3 4

    

}
