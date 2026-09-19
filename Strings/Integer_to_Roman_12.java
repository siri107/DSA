// integer to roman
// leetcode link: https://leetcode.com/problems/integer-to-roman/
import java.util.HashMap;
public class Integer_to_Roman_12 {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(symbols[i]);
            }
        }
        return sb.toString();
    }
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // approach 2: using HashMap
    public String intToRoman1(int num) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");

        StringBuilder sb = new StringBuilder();
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        for (int value : values) {
            while (num >= value) {
                num -= value;
                sb.append(map.get(value));
            }
        }
        return sb.toString();
    }
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // using hashmap only
    public String intToRoman3(int num) {

        HashMap<Integer, String> mp = new HashMap<>();

        mp.put(1, "I");
        mp.put(5, "V");
        mp.put(10, "X");
        mp.put(50, "L");
        mp.put(100, "C");
        mp.put(500, "D");
        mp.put(1000, "M");

        mp.put(4, "IV");
        mp.put(9, "IX");
        mp.put(40, "XL");
        mp.put(90, "XC");
        mp.put(400, "CD");
        mp.put(900, "CM");

        StringBuilder result = new StringBuilder();

        int place = 1;

        while (num != 0) {

            int digit = (num % 10) * place;
            num = num / 10;

            StringBuilder part = new StringBuilder();

            while (digit != 0) {

                int closest = 0;

                for (int n : mp.keySet()) {
                    if (n <= digit && n > closest) {
                        closest = n;
                    }
                }

                part.append(mp.get(closest));
                digit -= closest;
            }

            // Put higher place before lower place
            result.insert(0, part.toString());

            place *= 10;
        }

        return result.toString();
    }
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        Integer_to_Roman_12 obj = new Integer_to_Roman_12();
        System.out.println(obj.intToRoman3(1994)); // Output: MCMXCIV       
        System.out.println(obj.intToRoman(1994));
        System.out.println(obj.intToRoman1(1994));
    }
}
