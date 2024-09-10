package tcs_nqt;
import java.util.*;

public class tcs23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        ArrayList<Integer> prices = new ArrayList<>();

        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt(); 
        }    
        sc.close();
        long ans = maxSubarraySum(arr, n);
        System.out.println("maximum subarray sum: "+ans);
    }

    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int max = 0;
        for(int i = 0; i < prices.size(); i++){
            
            for(int j = i; j < prices.size(); j++){
                max = Math.max(max, prices.get(j) - prices.get(i));
            }
        }
        return max;
    }
}
