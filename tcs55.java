package tcs_nqt;

import java.util.*;

// Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.
// Input: s = "(1+(2*3)+((8)/4))+1"
// Output: 3
 

public class tcs55 {
    public static void main(String[] args) {
        String s = "(1)+((2))+(((3)))";
        System.out.println(maxDepth(s));
    }

    // TC - O(N) = iterating length of string
    // SC - O(N) = stack space

    public static int maxDepth(String s) {
        int count = 0;
        Stack<Character> st = new Stack<>();
        for(int i = 0; i <= s.length(); i++){
            char c = s.charAt(i);
            if(c == '(')    st.push('(');
            if(c == ')'){
                if(count < st.size())
                    count = st.size();
                st.pop();
            }
        }
        return count;
    }
}
