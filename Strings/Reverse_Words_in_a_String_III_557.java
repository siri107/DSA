// Reverse Words in a String III
//leetcode: https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class Reverse_Words_in_a_String_III_557 {
    // approach 1: using split() and StringBuilder
    // Time Complexity: O(n)    
    // Space Complexity: O(n)
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String str:arr)
        {
            sb.append(new StringBuilder(str).reverse().toString()).append(" ");
        }
        return sb.toString().trim();
    }
    // approach 2: using two pointers
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public String reverseWords1(String s) {
        char ch[]=s.toCharArray();
        int start=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==' ' || i==ch.length-1)
            {
                int end=i-1;
                if(i==ch.length-1)
                    end=i;
                
                while(start<end)
                {
                    char temp=ch[start];
                    ch[start]=ch[end];
                    ch[end]=temp;
                    start++;
                    end--;
                }
                start=i+1;
            }
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        Reverse_Words_in_a_String_III_557 obj = new Reverse_Words_in_a_String_III_557();
        String s = "Let's take LeetCode contest";
        System.out.println(obj.reverseWords(s)); // Output: "s'teL ekat edoCteeL tsetnoc"
        System.out.println(obj.reverseWords1(s)); // Output: "s'teL ekat edoCteeL tsetnoc"
    }
}
