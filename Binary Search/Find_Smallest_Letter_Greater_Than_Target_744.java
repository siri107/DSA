// Find Smallest Letter Greater Than Target
// lc link : https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/


public class Find_Smallest_Letter_Greater_Than_Target_744 {
    // approach 1:  using binary search
    // time : O(logn)
    // space : O(1)
    public static char nextGreatestLetter(char[] letters, char target) {
        int l=0;
        int r = letters.length -1;
        char ch = letters[0] ;
        int t = target-'a';
        while( l<=r ) {
            int mid= l+(r-l)/2;
            int m= letters[mid]-'a';
            if( m > t ) {
                ch = letters[mid];
                r = mid -1;
            }
            else
                l = mid+1;
        } 
        return ch;
    }
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters, target));
    }
}
