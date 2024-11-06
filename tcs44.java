package tcs_nqt;
import java.util.*;

// Postfix to Prefix - Given an postfix expression, Your task is to convert the given postfix expression to a prefix expression.
// TC - O(N)
// SC - O(N)


public class tcs44 {
    public static void main(String[] args) {
        String post_exp = "ABC/-AK/L-*";
        System.out.println(postfixToPrefix(post_exp));
    }

    public static boolean operator(char c){
        switch(c){
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                return true;
        }
        return false;
    }

    public static String postfixToPrefix(String s){
        Stack<String> st = new Stack<>();
        for(int i = 0 ; i <= s.charAt(i); i++){
            if(operator(s.charAt(i))){
                String a = st.pop();
                String b = st.pop();
                String c = s.charAt(i) + b + a;
                st.push(c);
            }
            else{
                st.push(s.charAt(i) + "");
            }
        }
        return st.pop();
    }
}