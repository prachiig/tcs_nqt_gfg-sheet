package tcs_nqt;

import java.util.*;

// Given a number n and a bit number k, check if the kth index bit of n is set or not. A bit is called set if it is 1. 
// The position of set bit '1' should be indexed starting with 0 from the LSB side in the binary representation of the number.
// Note: Index is starting from 0. You just need to return true or false, driver code will take care of printing "Yes" and "No".
// Input: n = 4, k = 2
// Output: true
// Explanation: Binary representation of 4 is 100, in which 2nd index bit from LSB is set. So, return true.


public class tcs46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(checkKthBit(n ,k));
        sc.close();
    }

    // TC - O(1)
    // SC - O(1)

    static boolean checkKthBit(int n, int k) {
        return (n & (1 << k)) != 0;
        
    }
}
