// Three Sum problem solution
// leetcode problem: https://leetcode.com/problems/3sum/

import java.util.*;

public class ThreeSum_15 {
    //approach 1
    //using brute force to check all triplets and return the unique triplets that sum up
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++)
        {
            
            for(int j=i+1;j< nums.length-1;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    List<Integer> temp = new ArrayList<>();
                    if(nums[i] + nums[j] + nums[k] == 0)
                    {
                        
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        if(!result.contains(temp)) {
                            result.add(temp);
                        }
                    }
                }
            }
            
        }
        return result;
    }
    //time complexity: O(n^3), where n is the length of the input array. We have three nested loops that iterate through the array to find all unique triplets that sum up to zero.
    //space complexity: O(m), where m is the number of unique triplets that sum
    //approach 2
    //using two pointer approach to find the unique triplets that sum up to zero. This  would have a time complexity of O(n^2) and a space complexity of O(m), where m is the number of unique triplets that sum up to zero.
    public List<List<Integer>> threeSumTwoPointer(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue; // skip duplicates
            int left = i+1;
            int right = nums.length-1;
            while(left<right)
            {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum==0)
                {
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left<right && nums[left]==nums[left+1]) left++; // skip duplicates
                    while(left<right && nums[right]==nums[right-1]) right--; // skip duplicates
                    left++;
                    right--;
                }
                else if(sum<0)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }
        }
        return result;
    }
    //time complexity: O(n^2), where n is the length of the input array. We have two nested loops that iterate through the array to find all unique triplets that sum up to zero.
    //space complexity: O(m), where m is the number of unique triplets that sum up to zero.
    public static void main(String[] args) {    
        ThreeSum_15 obj = new ThreeSum_15();
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println("Unique triplets that sum up to zero (approach 1): " + obj.threeSum(nums)); // Output: [[-1, -1, 2], [-1, 0, 1]]
        System.out.println("Unique triplets that sum up to zero (approach 2): " + obj.threeSumTwoPointer(nums)); // Output: [[-1, -1, 2], [-1, 0, 1]]
    }
}
