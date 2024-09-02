// Given an array of integers arr[] of size N and an integer d, the task is to rotate the array elements to the left by d positions
// Input:  d = 2 , arr[] = {1, 2, 3, 4, 5, 6, 7}
// Output: 3 4 5 6 7 1 2

// Input:  d = 4, arr[] = {3, 4, 5},
// Output: 4 5 3
// Rotating an array 4 times is effectively same as rotating it 4 – 3 = 1 time.

package tcs_nqt;
import java.util.Scanner;

public class tcs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt(); 
        }
        int d = sc.nextInt();
        sc.close();
        rotate1(arr, n, d);
        // System.out.println(a); 
    }
    public static void rotate1(int arr[], int n, int d){
        d = d % n;
        int k = 0;

        int newarr[] = new int[n];
        for (int i = d; i < newarr.length; i++) {
            newarr[k++] = arr[i];
            // System.out.print(newarr[k++]+" ");
        }
        for (int i = 0; i < d; i++) {
            newarr[k++] = arr[i];
            // System.out.print(newarr[k++]+" ");
        }
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i]+" ");
        }
    }
    
}
