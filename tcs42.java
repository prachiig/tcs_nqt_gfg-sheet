package tcs_nqt;


import java.util.Stack;


// Prefix to Infix - Given an prefix expression, Your task is to convert the given prefix expression to a infix expression.
// TC - O(N)
// SC - O(N)


// Read the Prefix expression in reverse order (from right to left)
// If the symbol is an operand, then push it onto the Stack
// If the symbol is an operator, then pop two operands from the Stack 
// Create a string by concatenating the two operands and the operator between them. 
// string = (operand1 + operator + operand2) 
// And push the resultant string back to Stack
// Repeat the above steps until the end of Prefix expression.
// At the end stack will have only 1 string i.e resultant string


public class tcs42 {
    public static void prefixToInfix(String s){
        Stack<String> st = new Stack<>();
        for(int i = s.length() - 1; i >= 0; i--){
            if(operator(s.charAt(i))){
                String a = st.pop();
                String b = st.pop();
                String c = "(" + a + s.charAt(i) + b + ")";
                st.push(c);
            }
            else{
                st.push(s.charAt(i)+"");
            }
        }
        System.out.println(st.pop());
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


    public static void main(String[] args) {
        String exp = "*-A/BC-/AKL";
        prefixToInfix(exp);
    }
}

