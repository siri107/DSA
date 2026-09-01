//================================================================  
//approach 1: two pointers
// If array is empty, return 0
// uniqueCount stores the position for the next unique element
// First element is already unique, so start uniqueCount = 
// Traverse the array from index 1
// If current element is different from the last unique element
// Store the current element at nums[uniqueCount]
// Increment uniqueCount
// Return uniqueCount (number of unique elements)


public class remove_duplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int uniqueCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueCount - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4};
        int k = removeDuplicates(nums);
        System.out.println("Number of unique elements: " + k);
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}