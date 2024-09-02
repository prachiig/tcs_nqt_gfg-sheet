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
        int res1 = removeDuplicates1(arr, n);
        System.out.println(res1);
    }

    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(arr[i]);
        }
        return set.size();
       
    }

    public static int removeDuplicates1(int[] arr,int n) {
        // Write your code here.
        int i = 0;
        for (int j = 1; j < n; j++) {
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
