
  //  Rotate an array of n elements to the right by k steps.
  //  https://leetcode.com/problems/rotate-array/
  //  Given an array, rotate the array to the right by k steps, where k is non-negative.
  //approah 1
  class rotate_array{
     public void rotate(int[] nums, int k) {
        int i,j,n=nums.length;
        int[] b=new int[n];
      for(i=0;i<k;i++)
      {
        for(j=0;j<n;j++)
        {
            if(j==n-1)  
                b[0]=nums[n-1];
            else
            {
                b[j+1]=nums[j];
            }
        }
        for(j=0;j<n;j++)
        {
            nums[j]=b[j];
        }
      } 
      for(i=0;i<n;i++)
      {
        System.out.print(b[i]);
      } 
    }
    //time complexity: O(n*k), where n is the length of the array. We perform k rotations, and each rotation takes O(n) time to shift the elements.
    //space complexity: O(n), as we are using an extra array of size n to store the rotated elements.
    //approach 2
    //// Get array length
// Handle k greater than n
// Create temporary array
// Copy last k elements to beginning
// Start from first element
// Copy remaining elements
// Copy result back to nums
    public void rotate1(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int b[]=new int[n];
        for(int i=0;i<k;i++)
        {
            b[i]=nums[n-k+i];
        }
        int j=0;
        for(int i=k;i<n;i++)
        {
            b[i]=nums[j];
            j++;
        }
        for(int i=0;i<n;i++)
        {
            nums[i]=b[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(b[i]);
        }
    }
    //time complexity: O(n), where n is the length of the array. We traverse the array once to copy the elements to the temporary array and then again to copy them back to the original array.
    //space complexity: O(n), as we are using an extra array of size n to store the rotated elements.
    public static void main(String[] args) {
        rotate_array solution = new rotate_array();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        solution.rotate(nums, k); // Output: [5,6,7,1,2,3,4]
        System.out.println();
        solution.rotate1(nums, k); // Output: [5,6,7,1,2,3,4]
    }
  }

    
