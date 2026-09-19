// Longest Substring Without Repeating Characters
// leetcode link : https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters_3 {
    // my approach brute force
    // time :
    // space
    public static int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0; i<s.length(); i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=i;j< s.length(); j++){
                if(!set.add(s.charAt(j))){
                    break;
                }
                
            }
            if(set.size() > max)
                max=set.size();
        }
        return max;
    }  
    public static void main(String[] args) {
        String s = "abcabcbbacde";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
