// Maximum Number of Vowels in a Substring of Given Length
// lc link : https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/
import java.util.ArrayList;
public class Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length_1456 {
    public static int maxVowels(String s, int k) {
        ArrayList<Character> vow= new ArrayList<>();
        vow.add('a');
        vow.add('e');
        vow.add('i');
        vow.add('o');
        vow.add('u');   
        int l=0;
        int maxcount = 0;
        for(int r=k-1; r<=s.length()-1; r++,l++) {
            String str= s.substring(l,r+1);
            int count=0;
            for(char ch  : str.toCharArray()) {
                if(vow.contains(ch))
                    count++;
            }
            maxcount= Math.max(maxcount, count);
        }
        return maxcount;
    }
    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    } 
    public static int maxVowels1(String s, int k) {
        int l=0;
        int maxcount;
        String str= s.substring(l,k);
        int count = 0;
        for(char ch  : str.toCharArray()) {
            if(isVowel(ch))
                count++;
        }
        maxcount = count;
        for(int r=k; r<=s.length()-1; r++,l++) {
            if(isVowel(s.charAt(r)))
                count++;
            if(isVowel(s.charAt(l)))
                count--;

            maxcount= Math.max(maxcount, count);
        }
        return maxcount;
    }
    public static void main(String[] args) {
        String s = "abciiidef";
        int k=4;
        System.out.println(maxVowels1(s,k));
        System.out.println(maxVowels(s,k));
    }
}