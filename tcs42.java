package tcs_nqt;


import java.util.Stack;

public class tcs42 {
    public static void prefixToInfix(String s){
        Stack<String> st = new Stack<>();
        for(int i = s.length() - 1; i >= 0; i--){
            if(operator(s.charAt(i))){
                String a = st.pop();
                String b = st.pop();
                String c = a + c + b;
                st.push(c);
            }
            else{
                st.push(s.charAt(i)+"");
            }
        }
        System.out.println(st.pop());
    }

    public static boolean operator(char c){
        switch(c):{
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
