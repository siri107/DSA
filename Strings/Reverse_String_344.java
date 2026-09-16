// Reverse a string. The input string is given as an array of characters char[].

// Do not allocate extra space for another array, you must do this by modifying
// the input array in-place with O(1) extra memory.

// LeetCode: https://leetcode.com/problems/reverse-string/

// Approach:
// Two pointer approach.
// One pointer starts at the beginning and another at the end.
// Swap the characters and move the pointers towards each other
// until they meet.
public class Reverse_String_344 {

    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static void main(String[] args) {

        Reverse_String_344 obj = new Reverse_String_344();

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        obj.reverseString(s);

        System.out.println(s); // Output: olleh
    }
}