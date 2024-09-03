package tcs_nqt;
import java.util.*;


public class tcs12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt(); 
        }
        sc.close();
        sort012(arr);
    }

    public static void sort012(int[] arr)
    {
        //Write your code here
        int countzero = 0;
        int countone = 0;
        int counttwo = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0)
                countzero++;
            else if(arr[i] == 1)
                countone++;
            else
                counttwo++;
        }
        for(int i = 0; i < n; i++){
            while(countzero != 0){
                arr[i] = 0;
                countzero--;
            }
            while(countone != 0){
                arr[i] = 0;
                countone--;
            }
            while(counttwo != 0){
                arr[i] = 0;
                counttwo--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
