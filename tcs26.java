import java.util.*;

public class tcs26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt(); 
        }    
        sc.close();
        int ans = longestSuccessiveElements(arr);
    }


    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        Arrays.sort(a);
        int n = a.length;
        int max = 0;
        int count = 0;
        for(int i = 0; i < n-1; i++){
            if(a[i+1] - a[i] == 1){
               count++;
               max = Math.max(max, count);
            }
            else{
               break;
            }
        }
        return max;
    }
}
