// Longest Common Prefix
//leetcode: https://leetcode.com/problems/longest-common-prefix

public class Longest_Common_Prefix_14 {
    // approach 1: Using horizontal scanning
    // Time Complexity: O(n*m) where n is the number of strings and m is the length of the shortest string
    // Space Complexity: O(1)   
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
    // APPROACH 2: Using vertical scanning
    // Time Complexity: O(n*m) where n is the number of strings and m is the length of the shortest string
    // Space Complexity: O(1)  
    // Start from the first character (index = 0).
    // Take the character from the first string.
    // Compare that character with the character at the same index in every other string.
    // If all are equal → move to the next index.
    // If even one character is different → stop immediately.
    // If any string reaches its end → stop.
    // The characters you successfully passed are the longest common prefix.         
    public String longestCommonPrefix1(String[] strs) {
        int i=0;
        boolean found=true;
        while(i<strs[0].length())
        {
            String str1=strs[0];
            for(int j=1;j<strs.length;j++)
            {
                if (i >= strs[j].length() || strs[j].charAt(i) != str1.charAt(i))
                {
                    found=false;
                    break;
                }   
            }
            if(!found)
                break;
            i++;
        }
        
        return strs[0].substring(0, i);   
    }
    // approach 3: Using divide and conquer
    // Time Complexity: O(n*m) where n is the number of strings and m is        the length of the shortest string
    // Space Complexity: O(m*log(n)) where m is the length of the shortest string and n is the number of strings
    public static void main(String[] args) {
        Longest_Common_Prefix_14 obj = new Longest_Common_Prefix_14();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(obj.longestCommonPrefix(strs)); // Output: "fl"
        System.out.println(obj.longestCommonPrefix1(strs)); // Output: "fl"
    }

}
