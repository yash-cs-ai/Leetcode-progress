package src; //Solution to problem RomantoInt https://leetcode.com/problems/roman-to-integer/
import java.util.Scanner;
import java.util.HashMap;

class Solution_rti {
        public int romanToInt(String s) {
            HashMap<Character, Integer> map = new HashMap<>();
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);

            int value = 0;

            for (int i = 0; i < s.length(); i++) {
                int curr = map.get(s.charAt(i));

                if (i < s.length() - 1 && curr < map.get(s.charAt(i + 1))) {
                    value -= curr;
                } else {
                    value += curr;
                }
            }
            return value;
        }
}
public class RomantoIntConv {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        String Roman = test.next();

        Solution_rti RtI = new Solution_rti();
        int Integer = RtI.romanToInt(Roman);

        System.out.println("Roman numeral:"+ Roman + "Integer: " + Integer);

    }
}
