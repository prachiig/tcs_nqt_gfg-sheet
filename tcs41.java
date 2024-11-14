package tcs_nqt;

import java.util.*;
import java.util.Stack;

// Infix to postfix - Given an infix expression, Your task is to convert the given infix expression to a postfix expression.
// TC = O(N) - N = length of infix expression
// SC = O(N) - stack size of N


// Scan the infix expression from left to right. 
// If the scanned character is an operand, put it in the postfix expression. 
// Otherwise, do the following
// If the precedence of the current scanned operator is higher than the precedence of the operator on top of the stack, or if the stack is empty, or if the stack contains a ‘(‘, then push the current operator onto the stack.
// Else, pop all operators from the stack that have precedence higher than or equal to that of the current operator. After that push the current operator onto the stack.
// If the scanned character is a ‘(‘, push it to the stack. 
// If the scanned character is a ‘)’, pop the stack and output it until a ‘(‘ is encountered, and discard both the parenthesis. 
// Repeat steps 2-5 until the infix expression is scanned. 
// Once the scanning is over, Pop the stack and add the operators in the postfix expression until it is not empty.
// Finally, print the postfix expression.



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

    public static void infixToPostfix(String s){
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
        infixToPostfix(exp);
    }
}
