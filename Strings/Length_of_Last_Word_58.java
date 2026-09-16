// Length of the last word
// leetcode: https://leetcode.com/problems/length-of-last-word/
public class Length_of_Last_Word_58 {
    // approach 1: using trim() and lastIndexOf() methods
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int lengthOfLastWord(String s) {
        String str=s.trim();
        return str.length()-str.lastIndexOf(' ')-1;
    }
    // approach 2: using split() method
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int lengthOfLastWord1(String s) {
        String[] arr=s.trim().split(" ");
        return arr[arr.length-1].length();
    }
    // approach 3: using a single pass
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int lengthOfLastWord2(String s) {
        int length=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
                if(length>0)
                    break;
            }
            else
                length++;
        }
        return length;
    }
    public static void main(String[] args) {
        Length_of_Last_Word_58 obj = new Length_of_Last_Word_58();
        String s = "Hello World";
        System.out.println(obj.lengthOfLastWord(s)); // Output: 5
        System.out.println(obj.lengthOfLastWord1(s)); // Output: 5
        System.out.println(obj.lengthOfLastWord2(s)); // Output: 5
    }
}
