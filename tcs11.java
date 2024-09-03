package tcs_nqt;
import java.util.*;

// Sam want to read exactly ‘TARGET’ number of pages.

// He has an array ‘BOOK’ containing the number of pages for ‘N’ books.

// Return YES/NO, if it is possible for him to read any 2 books and he can meet his ‘TARGET’ number of pages.

// Example:
// Input: ‘N’ = 5, ‘TARGET’ = 5
// ‘BOOK’ = [4, 1, 2, 3, 1] 

// Output: YES


public class tcs11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt(); 
        }
        sc.close();
        String res = read(n, arr, target);
        System.out.println(res);

        String res_map = read_map(n, arr, target);
        System.out.println(res_map);

        String res_2pointers = read_2pointer(n, arr, target);
        System.out.println(res_2pointers);
    }

    // TC - O(N*N)
    // SC - O(1)
    public static String read(int n, int []book, int target){
        // Write your code here.
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(book[i] + book[j] == target)
                    return "YES";
            }
        }
        return "NO";
    }


    // TC - O(N)
    // SC - O(N)
    public static String read_map(int n, int []book, int target){
        // Write your code here.
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(map.containsKey(target - book[i]))
                return "YES";
            else
            map.put(book[i], i);
        }
        return "NO" ;
    }


    // TC - O(N) + O(NlogN)   -> loop + sorting
    // SC - O(1)              -> no extra space

    public static String read_2pointer(int n, int []book, int target){
        // Write your code here.
        Arrays.sort(book);
        int start = 0;
        int end = n-1;
        while(start <= end){
            if(book[start] + book[end] == target)
                return "YES";
            else if(book[start] + book[end] < target)
                start++;
            else
                end--;
        }
        return "NO";
    }
}
