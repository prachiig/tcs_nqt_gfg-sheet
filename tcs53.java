package tcs_nqt;


// You are given a string num, representing a large integer. 
// Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.

// A substring is a contiguous sequence of characters within a string.
// Input: num = "52"
// Output: "5"
// Input: num = "35427"
// Output: "35427"


public class tcs53 {
    public static void main(String[] args) {
        String a = "35427";
        System.out.println(largestOddNumber(a));
    }

    public static String largestOddNumber(String num){
        for(int i = num.length() - 1; i >= 0 ; i--){
            if(num.charAt(i) % 2 != 0){
                return num.substring(0, i+1);
            }
        }
        return "";
    }
}
