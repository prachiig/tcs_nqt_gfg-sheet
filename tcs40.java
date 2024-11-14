import java.util.*;

// Check Balanced Parentheses. Given string str containing just the characters '(', ')', '{', '}', '[' and ']', check if the input string is valid and return true if the string is balanced otherwise return false.

// Note: string str is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.



// TC - O(N)
// SC - O(N)


public class tcs40 {
    public static void main(String[] args) {
        String s = "{([(])}";
        if(isValid(s)){
            System.out.println("balanced paranthesis");
        }
        else{
            System.out.println("unbalanced paranthesis");
        }
    }
    public static boolean isValid(String S){
        Stack<Character> s = new Stack<>();
        for(char ch : S.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }
            else{
                if(s.isEmpty())
                    return false;
                char it = s.pop();
                if((ch == ')' && it =='(') || (ch == '}' && it =='{') || (ch == ']' && it =='[')){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
}
