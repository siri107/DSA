// Find the Index of the First Occurrence in a String
// lc link :  https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

public class Find_the_Index_of_the_First_Occurrence_in_a_String_28 {
    public static int strStr(String haystack, String needle) {
        if(haystack.contains(needle))
            return haystack.indexOf(needle);
        return -1;   
    } 
    public static int strStr1(String haystack, String needle) {
        for(int i=0,j=needle.length();i< haystack.length()-needle.length() && j<haystack.length(); i++, j++){
            if(haystack.substring(i,j).equals(needle))
                    return  i;
        }
        return -1; 
    }  
    public static void main(String[] args) {
        String str1= "sadbutsad";
        String str2= "but";
        System.out.println(strStr(str1, str2));
        System.out.println(strStr1(str1, str2));
    }
}
