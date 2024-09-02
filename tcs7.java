package tcs_nqt;
import java.util.*;
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
    }

    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(arr[i]);
        }
        return set.size();
       
    }
}
