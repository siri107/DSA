// Find First and Last Position of Element in Sorted Array
// link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class Find_First_and_Last_Position_of_Element_in_Sorted_Array_34 {
    public int[] searchRange(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int ans1=-1;
        int ans2= -1;
        while(l<=r) {
            int mid= l+(r-l)/2;
            if(nums[mid] >= target) {
                if(nums[mid] == target)
                    ans1=mid;
                r = mid-1;
            }
            else
                l = mid+1;
        }   
        int arr[]= new int[2];
        arr[0]= ans1;
        l=0;
        r=nums.length-1;
        while(l<=r) {
            int mid= l+(r-l)/2;
            if(nums[mid] <= target) {
                if(nums[mid] == target)
                    ans2=mid;
                l = mid+1;
            }
            else
                r = mid-1; 
        } 
        arr[1]= ans2;
        return arr;
    }
    // time : O(logn), where n is the length of the array. We perform a binary search on the sorted array, which takes logarithmic time.
    // space : O(1)
    public int[] searchRange2(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }
    public int findFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int first = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                first = mid;
                right = mid - 1; // Continue searching in the left half
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return first;
    }
    public int findLast(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int last = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                last = mid;
                left = mid + 1; // Continue searching in the right half
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return last;
    }
    public static void main(String[] args) {
        Find_First_and_Last_Position_of_Element_in_Sorted_Array_34 solution = new Find_First_and_Last_Position_of_Element_in_Sorted_Array_34();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = solution.searchRange(nums, target);
        System.out.println("First and Last Position: [" + result[0] + ", " + result[1] + "]"); // Output: [3, 4]
        int[] result2 = solution.searchRange2(nums, target);
        System.out.println("First and Last Position (Method 2): [" + result2[0] + ", " + result2[1] + "]"); // Output: [3, 4]
    }
}
