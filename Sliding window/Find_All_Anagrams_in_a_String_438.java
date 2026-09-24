// Find All Anagrams in a String
// lc link : https://leetcode.com/problems/find-all-anagrams-in-a-string/description/

import java.util.ArrayList;
import java.util.List;

public class Find_All_Anagrams_in_a_String_438 {
    public static List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list= new ArrayList<>();
        int f[]= new int[26];
        if(s.length()< p.length())
            return list;
        for(int i=0; i<p.length();i++) {
            f[p.charAt(i)-'a']++;
        }
        for(int i=0; i<p.length();i++) {
            f[s.charAt(i)-'a']--;
        }
        boolean found=true;
        for( int j=0; j<26;j++){
            if(f[j]!=0){
                found=false;
                break;
            }
        }
        if(found){
            list.add(0);
        }

        int l=0;
        for(int r=p.length(); r<s.length();r++,l++) {
            f[s.charAt(r)-'a']--;
            f[s.charAt(l)-'a']++;
            found=true;
            for( int j=0; j<26;j++){
                if(f[j]!=0){
                    found=false;
                    break;
                }
            }
            if(found){
                list.add(l+1);
            }
        } 
        return list;  
    }
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s,p));
        String s1 = "abab";
        String p1 = "ab";
        System.out.println(findAnagrams(s1,p1));
        
    }
}