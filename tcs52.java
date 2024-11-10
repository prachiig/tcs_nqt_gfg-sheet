package tcs_nqt;

import java.util.*;

// Given an input string s, reverse the order of the words.
// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

// Return a string of the words in reverse order concatenated by a single space.

// Note that s may contain leading or trailing spaces or multiple spaces between two words. 
// The returned string should only have a single space separating the words. Do not include any extra spaces.

// Input: s = "the sky is blue"
// Output: "blue is sky the"
// Input: s = "  hello world  "
// Output: "world hello"


public class tcs52 {
    public static void main(String[] args) {
        String ans = "the sky is blue";
        System.out.println(reverseWords(ans));
    }

    public static String reverseWords(String s) {
        String finalans = "";
        Stack<String> st = new Stack<>();
        String[] arr = s.split("\\s+");
        
        for(int i = 0; i < arr.length; i++){
            st.push(arr[i]);
        }

        while(!st.empty()){
            finalans = finalans + st.pop() + " ";
        }
        
        return finalans.trim();
    }
}
