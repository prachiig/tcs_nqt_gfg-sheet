package tcs_nqt;
import java.util.*;
public class tcs13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt(); 
        }
        sc.close();
        int ans = majorityElement(arr);
        System.out.println(ans);
    }

    public static int majorityElement(int []v) {
        // Write your code here
        int n = v.length;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int  i = 0; i < n; i++){
            int value = map.getOrDefault(v[i], 0);
            map.put(v[i], value+1);
        }
        for(Map.Entry<Integer, Integer> a : map.entrySet()){
            if(a.getValue() > n/2)
                return a.getKey();
        }
        return ans;
    }
}
