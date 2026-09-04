//Missing Number 268
// https://leetcode.com/problems/missing-number/
public class Missing_Number_268 {
    public int missingNumber(int[] nums) {
        int miss=-1;
        int i,j;
        boolean found;
        for( i=0;i<=nums.length;i++)
        {
            found=false;
            for(j=0;j<nums.length;j++)
            {
                if(i==nums[j])
                {
                    found=true;
                    break;
                }
                    
                if(j==nums.length-1)
                {
                    found=false;
                    miss=i;
                    break;
                }
            }
            if(!found)
                return miss;
        }    
        return miss;    
    }
    public static void main(String[] args) {
        Missing_Number_268 obj=new Missing_Number_268();
        int[] nums={9,6,4,2,3,5,7,0,1};
        System.out.println(obj.missingNumber(nums));
    }
    //time complexity: O(n^2), where n is the length of the input array. We have a nested loop that iterates through the range of numbers from 0 to n and checks if each number is present in the input array.
    //space complexity: O(1), as we are using a constant amount of extra space
}
