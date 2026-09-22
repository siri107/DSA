// is sequence
// lc link: https://leetcode.com/problems/is-subsequence/

public class Is_Subsequence_392 {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
            return true;
        int i=0;
        for(int j=0; j<t.length() ; j++) {
            if(s.charAt(i) == t.charAt(j)) {
                i++;
            }
            if(i== s.length()) 
                return true;
        }
        
        return false;
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
