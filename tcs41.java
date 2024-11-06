package tcs_nqt;

import java.util.Stack;

// Infix to postfix - Given an infix expression, Your task is to convert the given infix expression to a postfix expression.


public class tcs41 {
    public static int precedence(char c){
        if(c == '^')
            return 3;
        else if(c == '*' || c == '/')
            return 2;
        else if(c == '+' || c == '-')
            return 1;
        else
            return -1;
    }

    public static void infixToPrefix(String s){
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            // if operand
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')){
                result.append(c);
            }

            // if '(' scanned
            else if(c == '('){
                st.push('(');
            }

            // if ')' scanned
            else if(c == ')')
            {
                while(st.peek() != '('){
                    result.append(st.pop());
                }
                st.pop();
            }

            // if operator scanned
            else{
                while(!st.empty() && (precedence(c) <= precedence(st.peek()))){
                    result.append(st.pop());
                }
                st.push(c);
            }
        }

        // empty stack to get result
        while(!st.empty()){
            result.append(st.pop());
        }

        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        infixToPrefix(exp);
    }
}
