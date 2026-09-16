// Valid Anagram
//leetcode: https://leetcode.com/problems/valid-anagram/


import java.util.Arrays;
import java.util.HashMap;

public class Valid_Anagram_242 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr2);
        for(int i=0;i<s.length();i++)
        {
            if(arr[i]!=arr2[i])
                return false;
        }  

        return true;
    }
    // Time Complexity: O(nlogn)
    // Space Complexity: O(n)   
    public boolean isAnagram1(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]!=0)
                return false;
        }
        return true;
    }
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public boolean isAnagram3(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character , Integer> map=new HashMap<>();
        for(char ch : s.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);
        for(char ch : t.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)-1);
        for(int i: map.values())
        {
            if(i!=0)
                return false;
        }
        return true;
    }
    // Time Complexity: O(n)
    // Space Complexity: O(n)   
    public static void main(String[] args) {
        Valid_Anagram_242 obj = new Valid_Anagram_242();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(obj.isAnagram(s, t)); // Output: true
        System.out.println(obj.isAnagram1(s, t)); // Output: true
        System.out.println(obj.isAnagram3(s, t)); // Output: true
    }
}