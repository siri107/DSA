// Find the special integer that appears more than 25% of the time in a sorted array
// https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/description/
import java.util.*;
public class ElementAppearingMoreThan25PercentInSortedArray_1287 {
    public int findSpecialInteger(int[] arr) {
        int res=arr[0];
        int count=1;
        for(int i=0; i< arr.length-1; i++)
        {
            
            if(arr[i]==arr[i+1])
                count++;
            else
                count=1;
            if(count>(arr.length/4))
            {
                res=arr[i];
                break;
            }
        }
        return res;
    }
    // time complexity: O(n), where n is the length of the input array. We iterate through the array once to count the occurrences of each element.
    // space complexity: O(1), as we are using a constant amount of extra space 
    //approach 2: hashmap to count the occurrences of each element and return the first element that appears more than 25% of the time. This would have a time complexity of O(n) and a space complexity of O(n).
    //time complexity: O(n), where n is the length of the input array. We iterate through the array once to count the occurrences of each element using a hashmap.
    public int findSpecialInteger1(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i])>(arr.length/4))
                return arr[i];
        }
        return -1;
    }   
    public static void main(String[] args) {
        ElementAppearingMoreThan25PercentInSortedArray_1287 obj = new ElementAppearingMoreThan25PercentInSortedArray_1287();
        int[] arr = {1,2,2,6,6,6,6,7,10};
        System.out.println("Element appearing more than 25% in sorted array: " + obj.findSpecialInteger1(arr)); // Output: 6     
        System.out.println("Element appearing more than 25% in sorted array: " + obj.findSpecialInteger(arr)); // Output: 6     
    }
}
