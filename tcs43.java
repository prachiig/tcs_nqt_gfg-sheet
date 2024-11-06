package tcs_nqt;

import java.util.Stack;

// Prefix to Postfix - Given an prefix expression, Your task is to convert the given prefix expression to a postfix expression.
// TC - O(N)
// SC - O(N)

public class tcs43 {
    public static void main(String[] args) {
        String pre_exp = "*-A/BC-/AKL";
        System.out.println(preToPost(pre_exp));
    }

    static String preToPost(String pre_exp) {
        String midans = prefixToInfix(pre_exp);
        String result = infixToPostfix(midans);
        return result;
    }
    
    public static String prefixToInfix(String exp){
        
        Stack<String> st = new Stack<>();
        for(int i = exp.length() - 1; i >= 0; i--){
            if(operator(exp.charAt(i))){
                String a = st.pop();
                String b = st.pop();
                String c = "(" + a + exp.charAt(i) + b + ")";
                st.push(c);
            }
            else{
                st.push(exp.charAt(i) + "");
            }
        }
        
        return st.pop();
    }
    
    public static String infixToPostfix(String s){
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
        return result.toString();
    }
    
    public static boolean operator(char c){
        switch(c){
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '%':
                return true;
        }
        return false;
    }
    
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
}
