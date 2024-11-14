import java.util.*;


// You are given an array/list 'prices' where the elements of the array represent the prices of the stock as they were yesterday and indices of the array represent minutes. 
// Your task is to find and return the maximum profit you can make by buying and selling the stock. You can buy and sell the stock only once.

// Note:

// You can’t sell without buying first.
// For Example:
// For the given array [ 2, 100, 150, 120],
// The maximum profit can be achieved by buying the stock at minute 0 when its price is Rs. 2 and selling it at minute 2 when its price is Rs. 150.
// So, the output will be 148.


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
