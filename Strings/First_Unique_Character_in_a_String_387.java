// First Unique Character in a String
//leetcode: https://leetcode.com/problems/first-unique-character-in-a-string/
import java.util.HashMap;
public class First_Unique_Character_in_a_String_387 {
    // approach 1: Using HashMap to store the frequency of each character and then iterate through the string to find the first unique character.
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    // approach 2: Using an array to store the frequency of each character and then iterate through the string to find the first unique character.
    public int firstUniqChar1(String s) {
        int[] arr = new int[26];
        for (char ch : s.toCharArray()) {
            arr[ch - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        First_Unique_Character_in_a_String_387 obj = new First_Unique_Character_in_a_String_387();
        String s = "loveleetcode";
        System.out.println(obj.firstUniqChar(s)); // Output: 2
        System.out.println(obj.firstUniqChar1(s)); // Output: 2
    }   
}
