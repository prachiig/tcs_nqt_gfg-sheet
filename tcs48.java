

import java.util.Scanner;

// Given an integer n, return true if it is a power of two. Otherwise, return false.
// An integer n is a power of two, if there exists an integer x such that n == 2x.

public class tcs48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = powerof2(n);
        if(ans == true){
            System.out.println("true: power of 2");
        }
        else{
            System.out.println("false: not power of 2");
        }
        sc.close();
    }

    public static boolean powerof2(int n){
        return (n != 0) && ((n - 1) & n) == 0;
    }
}
