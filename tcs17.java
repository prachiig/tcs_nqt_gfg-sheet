package tcs_nqt;
import java.util.*;


public class tcs17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();        
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt(); 
        }
        sc.close();
        int[] ans = getFloorAndCeil(arr, n, x);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        // Write your code here.
        int getFloorAndCeil[] = new int[2];
        getFloorAndCeil[0] = -1;
        getFloorAndCeil[1] = -1;
        int s = 0;
        int e = n - 1;
        int mid;
        while(s <= e){
          mid = s + (e-s)/2;
          if(a[mid] == x){
            getFloorAndCeil[0] = getFloorAndCeil[1] = a[mid];
            break;
          }
          else if(a[mid] < x){
            getFloorAndCeil[0] = a[mid];
            s = mid + 1;
          }
          else if(a[mid] > x){
            getFloorAndCeil[1] = a[mid];
            e = mid - 1;
          }
        }
        return getFloorAndCeil;
      }
}
