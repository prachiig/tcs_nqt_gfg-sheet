package tcs_nqt;

import java.util.Stack;

// Postfix to Infix - Given an postfix expression, Your task is to convert the given postfix expression to a infix expression.
// TC - O(N)
// SC - O(N)

public class tcs45{
    public static void main(String[] args) {
        String exp = "ab*c+";
        System.out.println(postfixToInfix(exp));
    }

    public static String postfixToInfix(String s){

        Stack<String> st = new Stack<>();

        for(int i = 0 ; i < s.length(); i++){
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')){
                st.push(s.charAt(i) + "");
            }
            else{
                String a = st.pop();
                String b = st.pop();
                String c = "(" + b + s.charAt(i) + a + ")";
                st.push(c);
            }
        }
        return st.pop();
    }
}


