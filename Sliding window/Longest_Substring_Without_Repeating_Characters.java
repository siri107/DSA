// Longest Substring Without Repeating Characters
// leetcode link : https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters {
    // my approach brute force
    // time : O(n^2)
    // space : O(n)
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
    // sliding window
    public static int lengthOfLongestSubstring1(String s) {
        HashSet<Character> set=new HashSet<>();
        int l=0;
        int r=0;
        int maxlen =0;
        while(r<s.length()) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            r++;
            maxlen= Math.max(maxlen, set.size());
        }
        return maxlen;
    }
    // time: O(2n)
    //space : O(n)
    public static void main(String[] args) {
        String s = "abcabcbbacde";
        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstring1(s));
    }
}
