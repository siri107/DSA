// Ransom Note
// leetcode: https://leetcode.com/problems/ransom-note
import java.util.HashMap;

public class Ransom_Note_383 {
    // approach 1: Using HashMap to store the frequency of each character in the magazine and then iterate through the ransom note to check if all characters are present in the magazine.
    // Time Complexity: O(n)    
    // Space Complexity: O(n)
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : magazine.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : ransomNote.toCharArray()) {
            if (!map.containsKey(ch)) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }
        return true;
    }
    // approach 2: Using an array to store the frequency of each character in the magazine and then iterate through the ransom note to check if all characters are present in the magazine.
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public boolean canConstruct1(String ransomNote, String magazine) {      
        int[] arr = new int[26];
        for (char ch : magazine.toCharArray()) {
            arr[ch - 'a']++;
        }
        for (char ch : ransomNote.toCharArray()) {
            if (arr[ch - 'a'] == 0) {
                return false;
            }
            arr[ch - 'a']--;
        }
        return true;
    }
    public static void main(String[] args) {
        Ransom_Note_383 obj = new Ransom_Note_383();
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(obj.canConstruct(ransomNote, magazine)); // Output: true
        System.out.println(obj.canConstruct1(ransomNote, magazine)); // Output: true
    }
}