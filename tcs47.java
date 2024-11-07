package tcs_nqt;

import java.util.Scanner;

// Even or odd using bitwise operators

public class tcs47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        oddeven(n);
        sc.close();
    }

    public static void oddeven(int n){
        if((n & 1) == 1)
            System.out.println("odd");
        else
            System.out.println("even");
        
    }

}
