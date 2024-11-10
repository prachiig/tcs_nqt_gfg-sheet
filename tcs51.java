package tcs_nqt;


// A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.

// For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
// A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.

// Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.
// Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.
// Input: s = "(()())(())"
// Output: "()()()"


public class tcs51 {
    public static void main(String[] args) {
        String s = "(()())(())()";
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String s){
        int start = 0;
        int opencount = 0;
        int closecount = 0;
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '(')
                opencount++;
            else if(c == ')')
                closecount++;

            if(opencount == closecount){
                result += s.substring(start + 1, i);
                start = i + 1;
            }
        }
        return result;
    }
}
