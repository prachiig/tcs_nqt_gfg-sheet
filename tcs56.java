import java.util.*;

public class tcs56 {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int val = 0;
        for(int i = 0; i < s.length(); i++){
            if((i+1 < s.length()) && (map.get(s.charAt(i)) < map.get(s.charAt(i+1)))){
                val = val + (map.get(s.charAt(i+1)) - map.get(s.charAt(i)));
                i++;
            }
            else{
                val = val + map.get(s.charAt(i));
            }
        }
        return val;
    }
}
