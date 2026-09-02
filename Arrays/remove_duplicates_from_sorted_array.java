// Remove Duplicates from Sorted Array
// leetcode problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
//approach: Two Pointers
class remove_duplicates_from_sorted_array {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {
        remove_duplicates_from_sorted_array solution = new remove_duplicates_from_sorted_array();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int length = solution.removeDuplicates(nums);
        System.out.println("Length of array after removing duplicates: " + length);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}