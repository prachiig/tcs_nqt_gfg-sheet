
import java.util.*;

public class tcs50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap1(a, b);
        swap2(a, b);
        swap3(a, b);
        sc.close();
    }

    public static void swap1(int a, int b){
        System.out.println("Before Swapping: ");
        System.out.println("a = " + a + " b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping using 3rd variable: ");
        System.out.println("a = " + a + " b = " + b);
    }

    public static void swap2(int a, int b){
        System.out.println("Before Swapping: ");
        System.out.println("a = " + a + " b = " + b);
        a = a + b; 
        b = a - b; 
        a = a - b; 
        System.out.println("After Swapping without using temporary variable: ");
        System.out.println("a = " + a + " b = " + b);
    }

    public static void swap3(int a, int b){
        System.out.println("Before Swapping: ");
        System.out.println("a = " + a + " b = " + b);
        a = a ^ b; 
        b = b ^ a; 
        a = a ^ b; 
        System.out.println("After Swapping using XOR: ");
        System.out.println("a = " + a + " b = " + b);
    }
}
