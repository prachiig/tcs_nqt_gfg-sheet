package tcs_nqt;
import java.util.*;

public class tcs23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        ArrayList<Integer> prices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            prices.add(x);
        } 
        sc.close();
        int ans = maximumProfit(prices);
        System.out.println("maximum profit in buying and selling: "+ans);
        int ans2 = maximumProfit2(prices);
        System.out.println("maximum profit in buying and selling: "+ans2);
    }


    // TC - O(N*N)
    // SC - O(1)
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int max = 0;
        for(int i = 0; i < prices.size(); i++){
            for(int j = i; j < prices.size(); j++){
                if(prices.get(j) > prices.get(i))
                    max = Math.max(max, prices.get(j) - prices.get(i));
            }
        }
        return max;
    }


    // TC - O(N)
    // SC - O(1)
    public static int maximumProfit2(ArrayList<Integer> prices){
        // Write your code here.
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < prices.size(); i++){
            min = Math.min(min, prices.get(i));
            max = Math.max(max, prices.get(i) - min);
        }
        return max;
    }
}
