package tcs_nqt;
import java.util.*;


public class tcs21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt(); 
        }    
        sc.close();
        System.out.println(Arrays.toString(moveZeros(n, arr)));
    }

    public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        int count = 0;
        for(int i = 0; i < n; i++){
            if(a[i] != 0)
                a[count++] = a[i];
        }
        for(int i = count; i < n ; i++){
            a[i] = 0;
        }
        return a;
    }
}
