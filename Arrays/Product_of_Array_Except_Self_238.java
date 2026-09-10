// Product of Array Except Self
    // Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
    // The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

public class Product_of_Array_Except_Self_238 {
    // approach 1
    // using brute force to calculate the product of all elements except the current element. This would have a time complexity of O(n^2) and a space complexity of O(n).
    // time complexity: O(n^2), where n is the length of the input array. We have two nested loops that iterate through the array to calculate the product of all elements except the current element.
    // space complexity: O(n), as we are using an extra array to store the result
    public int[] pro(int[] nums){
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int product=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    product*=nums[j];
                }
            }
            a[i]=product;
        }
        return a;
    }
    // approach 2
    public int[] productExceptSelf(int[] nums) {
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        int product=1;
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
                product=1;
            else
            {
                product*=nums[i-1];
            }
            left[i]=product;    
        } 
        for(int i=nums.length-1;i>=0;i--)
        {
            if(i==nums.length-1)
                product=1;
            else
            {
                product*=nums[i+1];
            } 
            right[i]=product;  
        } 
        for(int i=0;i<nums.length;i++)
        {
            res[i]=left[i]*right[i];
        }
        return res;   
    }
    // time complexity: O(n), where n is the length of the input array. We iterate through the array three times to calculate the left and right products and then combine them to get the final result.
    // space complexity: O(n), as we are using two extra arrays to store the left

    public static void main(String[] args) {
        Product_of_Array_Except_Self_238 obj = new Product_of_Array_Except_Self_238();
        int[] nums = {1, 2, 3, 4};
        int[] result = obj.pro(nums);
        int[] result1 = obj.productExceptSelf(nums);
        System.out.print("Product of array except self: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Product of array except self (approach 2): ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();   
    }
}

