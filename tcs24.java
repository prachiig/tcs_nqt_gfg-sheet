package tcs_nqt;
import java.util.*;


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
}
