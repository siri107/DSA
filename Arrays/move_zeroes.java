//283. Move Zeroes
//leetcode.com/problems/move-zeroes/
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.
//approach 1: Taking another array and copying the non-zero elements to it and then copying the non-zero elements back to the original array.
public class move_zeroes {

    public void moveZeroes(int[] nums) {
     int n=nums.length,j=0,k=0,i;
     int b[]=new int[n];   
     for(i=0;i<n;i++)
     {
        if(nums[i]==0)
        {
             b[n-(j+1)]=0;
             j++;
        }
        else
        {
        b[k]=nums[i];
        k++;
        }
     }
    
    for(i=0;i<n;i++)
     {
        System.out.print(b[i]);
     }
    
    for(i=0;i<n;i++)
     {
        System.out.print(nums[i]);
     }
    }
    //time complexity: O(n), where n is the length of the array. We traverse the array once to copy the non-zero elements and then again to copy them back to the original array.
    //space complexity: O(n), as we are using an extra array of size n to store the non-zero elements.      
    //approach 2: Using two pointers, one pointer to traverse the array and the other pointer to keep track of the position of the next non-zero element.
    public void moveZeroes1(int[] nums) {
        int n=nums.length,j=0,i;
        for(i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                nums[j]=nums[i];
                j++;
            }
        }
        while(j<n)
        {
            nums[j]=0;
            j++;
        }
        for(i=0;i<n;i++)
        {
            System.out.print(nums[i]);
        }
    }
    //time complexity: O(n), where n is the length of the array. We traverse the array once to copy the non-zero elements and then again to fill the remaining positions with zeros.
    //space complexity: O(1), as we are using a constant amount of extra space.
    //approach 3: Using a single pointer to traverse the array and swap the non-zero elements with the zeros.
    public void moveZeroes2(int[] nums) {
        int n=nums.length,j=0,i;
        for(i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(nums[i]);
        }
    }
    //time complexity: O(n), where n is the length of the array. We traverse the array once to swap the non-zero elements with the zeros.
    //space complexity: O(1), as we are using a constant amount of extra space
    public static void main(String[] args) {
        move_zeroes solution = new move_zeroes();
        int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums); // Output: [1, 3, 12, 0, 0]
        System.out.println();
        int[] nums1 = {0, 1, 0, 3, 12};
        solution.moveZeroes1(nums1); // Output: [1, 3, 12, 0, 0]
        System.out.println();
        int[] nums2 = {0, 1, 0, 3, 12};
        solution.moveZeroes2(nums2); // Output: [1, 3, 12, 0, 0]
    }
}
