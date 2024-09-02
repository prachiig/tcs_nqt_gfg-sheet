package tcs_nqt;

// Joseph is learning digital logic subject which will be for his next semester. He usually tries to solve unit assignment problems before the lecture. 
// Today he got one tricky question. The problem statement is “A positive integer has been given as an input. 
// Convert decimal value to binary representation. Toggle all bits of it after the most significant bit including the most significant bit. 
// Print the positive integer value after toggling all bits”.

// Constrains-
// 1<=N<=100

// Example 1:

// Input :
// 10  -> Integer

// Output :
// 5    -> result- Integer

// Explanation:
// Binary representation of 10 is 1010. After toggling the bits(1010), will get 0101 which represents “5”. Hence output will print “5”.

import java.util.*;

public class tcs3 {
    // Online Java Compiler
    // Use this editor to write, compile and run your Java code online
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        decimalToBinary(a);
        sc.close();
    }

    public static void decimalToBinary(int a) {
        String rev = "";
        while (a > 0) {
            int d = a % 2;
            rev = d + rev;
            a = a / 2;
        }
        System.out.println("After conversion to decimal: "+rev);
        toggle(rev);
    }

    public static void toggle(String rev) {
        String newrev = "";
        for (int i = 0; i < rev.length(); i++) {
            if (rev.charAt(i) == '0')
                newrev = newrev + '1';
            else
                newrev = newrev + '0';
        }
        System.out.println("After toggling: "+newrev);
        binaryToDecimal(newrev);
    }

    public static void binaryToDecimal(String newrev) {
        int c = 0;
        int newnum = 0;
        for(int i = newrev.length() - 1;i>0;i--){
            if (newrev.charAt(i) == '1') {
                newnum = newnum + (int) (Math.pow(2, c));
                c++;
            }
            else
                c++;
        }
        System.out.println("After toggling and conversion to decimal: "+ newnum);
    }   
}
