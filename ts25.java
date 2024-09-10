package tcs_nqt;
import java.util.*;


// There is an integer array ‘a’ of size ‘n’.
// An element is called a Superior Element if it is greater than all the elements present to its right.
// You must return an array all Superior Elements in the array ‘a’.

// Note:
// The last element of the array is always a Superior Element. 
// Example

// Input: a = [1, 2, 3, 2], n = 4
// Output: 2 3

// Explanation: 
// a[ 2 ] = 3 is greater than a[ 3 ]. Hence it is a Superior Element. 
// a[ 3 ] = 2 is the last element. Hence it is a Superior Element.
// The final answer is in sorted order.


public class ts25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt(); 
        }    
        sc.close();
        System.out.println(superiorElements(arr));
        System.out.println(superiorElements2(arr));
    }

    

    // TC - O(N)
    // SC - O(N)
    public static List< Integer > superiorElements(int []a) {
        int n = a.length;
        ArrayList<Integer> list = new ArrayList<Integer>();      
        int maxi = a[n-1];
        list.add(a[n-1]);
        for(int i = n-2; i >= 0; i--){
            if(a[i] > maxi){
                list.add(a[i]);
                maxi = a[i];
            }
        }
        return list;
    }



    // TC - O(N*N)
    // SC - O(N)
    public static List< Integer > superiorElements2(int []a) {
        ArrayList<Integer> ans= new ArrayList<>();
        int n = a.length;
        for (int i = 0; i < n; i++) {
        boolean leader = true;

        //Checking whether arr[i] is greater than all 
        //the elements in its right side
            for (int j = i + 1; j < n; j++)
            if (a[j] > a[i]) {
          
        // If any element found is greater than current leader
        // curr element is not the leader.
                leader = false;
                break;
            }

        // Push all the leaders in ans array.
            if (leader)
            ans.add(a[i]);

        }
        return ans;
    }
}
