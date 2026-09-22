// Permutation in String
// leetcode link : https://leetcode.com/problems/permutation-in-string/description/

import java.util.Arrays;

public class Permutation_in_String_567 {
    public static boolean checkInclusion(String s1, String s2) {
        char arr1[] = s1.toCharArray();
        Arrays.sort(arr1);
        String str1 = new String(arr1);
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            String temp = s2.substring(i, i + s1.length());
            char arr2[] = temp.toCharArray();
            Arrays.sort(arr2);
            String str2 = new String(arr2);
            if (str1.equals(str2))
                return true;
        }
        return false;
    }
    // Complexity of this sorting approach: roughly O((n-m+1) × m log m) time and O(m) space, where n = s2.length() and m = s1.length().
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1,s2));
    }
}
