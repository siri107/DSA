// Longest palindromic substring
// leet code link :https://leetcode.com/problems/longest-palindromic-substring/description/

import java.util.HashMap;
public class Longest_Palindromic_Substring_5 {
    public static String longestPalindrome(String s) {
        if(s.length()==1)
            return s;
        String longest= "";
        for(int i=0; i< s.length()-1; i++)
        {
            
            for(int j=i ; j< s.length(); j++){
            
                int end = j;
                int start=i;
                boolean found=true;
                while(start<= end){
                    if(s.charAt(start)!= s.charAt(end)){
                        found=false;
                        break;
                        
                    }
                    start++;
                    end--;
                }
                if(found){
                    if( s.substring(i,j+1).length() > longest.length()){
                        longest=s.substring(i,j+1);
                    }
                }
            }
        } 
        return longest;
    }
    // this takes 1800+ ms
    // time : O(n^3)
    // space : O(n)
     public static String longestPalindrome1(String s) {
        if(s.length()==1)
            return s;
        HashMap<Integer , String> map = new HashMap<>();
        for(int i=0; i< s.length()-1; i++)
        {
            
            for(int j=i ; j< s.length(); j++){
                
                int end = j;
                int start=i;
                boolean found=true;
                while(start<= end){
                    if(s.charAt(start)!= s.charAt(end)){
                        found=false;
                        break;
                        
                    }
                    start++;
                    end--;
                }
                if(found){
                    map.put(j+1-i, s.substring(i,j+1));
                }
            }
        } 
        int max=0;
        for(int n : map.keySet()){
            if(n>max){
                max=n;
            }
        } 
        if(max==0){
            return s.substring(0,1);
        }
        return map.get(max);
    }
    // time : 0(n^3)
    // space O(n)
    // optimal approach:  take the index, calsulate odd center and even center by expanding, and check it with longest length, which has greater value place it in longest, return the longest
     public static String longestPalindrome3(String s) {

        if (s.length() <= 1)
            return s;

        String longest = "";

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            String odd = expand(s, i, i);

            // Even length palindrome
            String even = expand(s, i, i + 1);

            if (odd.length() > longest.length())
                longest = odd;

            if (even.length() > longest.length())
                longest = even;
        }

        return longest;
    }

    public static String expand(String s, int left, int right) {

        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        return s.substring(left + 1, right);
    } 
    // time : 0(n^2)
    // space O(n)
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome3(s));
        System.out.println(longestPalindrome1(s));
        System.out.println(longestPalindrome(s));
    }    
}
