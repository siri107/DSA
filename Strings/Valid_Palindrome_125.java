// Valid Palindrome
//leetcode: https://leetcode.com/problems/valid-palindrome

public class Valid_Palindrome_125 {
    
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public boolean isPalindrome1(String s) {
        StringBuilder sb1=new StringBuilder();
        for(char ch : s.toCharArray())
        {
            if(Character.isLetterOrDigit(ch))
                sb1.append(Character.toLowerCase(ch));
        } 
        String str= sb1.toString();
        String str2=sb1.reverse().toString();
        return str.equals(str2);  
    }
    // Time Complexity: O(n)
    // Space Complexity: O(n)       
    public static void main(String[] args) {

        Valid_Palindrome_125 obj = new Valid_Palindrome_125();

        String s = "A man, a plan, a canal: Panama";

        System.out.println(obj.isPalindrome(s)); // Output: true
        System.out.println(obj.isPalindrome1(s)); // Output: true
    }   
}
