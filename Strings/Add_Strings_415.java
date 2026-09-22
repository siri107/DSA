// Add Strings
//  leetcode link : https://leetcode.com/problems/add-strings/description/
public class Add_Strings_415 {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.reverse().toString();
    }
    // Time Complexity: O(max(n, m))
    // Space Complexity: O(max(n, m))/
    //approach 2: using Integer.parseInt() and String.valueOf()
    public String addStrings1(String num1, String num2) {
        int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
        return String.valueOf(sum);
    }
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public static void main(String[] args) {
        Add_Strings_415 obj = new Add_Strings_415();
        String num1 = "11";
        String num2 = "123";
        System.out.println(obj.addStrings(num1, num2)); // Output: "134"
        System.out.println(obj.addStrings1(num1, num2)); // Output: "134"
    }   
}
