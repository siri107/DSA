// is sequence
// lc link: https://leetcode.com/problems/is-subsequence/

public class Is_Subsequence_392 {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public boolean isSubsequence2(String s, String t) {
        int index=-1;
        
        if(s.length()==0)
            return true;
        for(char ch : s.toCharArray()){
            int currindex=t.indexOf(ch,index+1);
            if(currindex==-1){
                
                return false;
            }
            index=currindex;
        }  
        return true; 
    }
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        Is_Subsequence_392 obj = new Is_Subsequence_392();
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(obj.isSubsequence(s, t)); // Output: true
        System.out.println(obj.isSubsequence2(s, t)); // Output: true
    }
}
