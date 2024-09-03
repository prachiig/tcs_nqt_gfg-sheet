package tcs_nqt;
import java.util.*;

// You have been given an integer array/list(ARR) of size 'N'. It only contains 0s, 1s and 2s. Write a solution to sort this array/list.

// Note :
// Try to solve the problem in 'Single Scan'. 
// ' Single Scan' refers to iterating over the array/list just once or to put it in other words, you will be visiting each element in the array/list just once.
public class tcs12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt(); 
        }
        sc.close();
        sort012(arr);
    }

    public static void sort012(int[] arr)
    {
        int countzero = 0;
        int countone = 0;
        int counttwo = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0)
                countzero++;
            else if(arr[i] == 1)
                countone++;
            else
                counttwo++;
        }
        int k = 0;
        for(int i = 0; i < countzero; i++){
            arr[k++] = 0;
        }
        for(int i = 0; i < countone; i++){
            arr[k++] = 1;  
        }
        for(int i = 0; i < counttwo; i++){
            arr[k++] = 2;
        }
    }
}
