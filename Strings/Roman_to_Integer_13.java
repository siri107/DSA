// Roman to Integer
// leetcode link: https://leetcode.com/problems/roman-to-integer/
import java.util.HashMap;
public class Roman_to_Integer_13 {
    // approach 1: using HashMap
    // iterate from right to left, if the current value is less than the previous value, subtract it from the sum, otherwise add it to the sum
    public int romanToInt1(String s) {
        HashMap<Character, Integer> mp=new HashMap<>();
        int n[]= new int[1000];
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000); 
        int j=0; 
        for(int i=s.length()-1; i>=0 ; i--)
        {
            if(i!=0){
            if(mp.get(s.charAt(i))<= mp.get(s.charAt(i-1)))
            {
                n[j]=mp.get(s.charAt(i));
                j++;
            }
            else
            {
                n[j]=mp.get(s.charAt(i)) - mp.get(s.charAt(i-1));
                i--;
                j++;
            }
            }
            else
                n[j]=mp.get(s.charAt(i));
                j++;
        } 
        int sum=0;
        for(int k=0 ;k<1000;k++)
        {
            sum+=n[k];  
        }
        return sum;
    }
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
                sum += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
            } else {
                sum += map.get(s.charAt(i));
            }
        }
        return sum;
    }
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static void main(String[] args) {
        Roman_to_Integer_13 obj = new Roman_to_Integer_13();
        String s = "MCMXCIV";
        System.out.println(obj.romanToInt(s)); // Output: 1994
    }
}