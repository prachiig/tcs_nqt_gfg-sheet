package tcs_nqt;

import java.util.*;

// You are given a positive integer ‘n’.

// Your task is to find and return its square root. If ‘n’ is not a perfect square, then return the floor value of sqrt(n).

// Example:
// Input: ‘n’ = 7
// Output: 2

// Explanation:
// The square root of the number 7 lies between 2 and 3, so the floor value is 2.

public class tcs20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();        
        sc.close();
        int ans = sqrtN(N);
        System.out.println("floor value of square root of a number: "+ans);
        int ans_binary = sqrtN_binary(N);
        System.out.println("floor value of square root of a number: "+ans_binary);
        int ans_BS = sqrtN_BS(N);
        System.out.println("floor value of square root of a number: "+ans_BS);
    }

    // Using the in-built sqrt() from Math library
    // TC - O(log N) - In-built binary search algorithm
    // SC - O(1)
    public static int sqrtN(long N) {
        int n = (int) Math.sqrt(N);
        return n;
    }

    // TC - O(N) - Uses linear search
    // SC - O(1)
    public static int sqrtN_binary(long N) {
        int ans = 0;
        for (long i = 1; i <= N; i++) {
            if (i * i <= N) {
                ans = (int) i;
            } else {
                break;
            }
        }
        return ans;
    }

    public static int sqrtN_BS(long N) {
        long s = 0;
        long e = N;
        long mid;
        long ans = 0;
        while (s <= e) {
            mid = s + (e - s) / 2;
            if (mid * mid == N)
                return (int) mid;
            else if (mid * mid < N) {
                ans = (int) mid;
                s = mid + 1;
            } else if (mid * mid > N) {
                e = mid - 1;
            }
        }
        return (int)ans;
    }

}
