import java.util.Arrays;
import java.util.PriorityQueue;
//finding the kth largest element in an array
//https://leetcode.com/problems/kth-largest-element-in-an-array/
//approch 1: sort the array and return the kth largest element
public class find_kth_large_element {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
//time complexity: O(n log n), where n is the length of the array. We sort the array, which takes O(n log n) time.
//space complexity: O(1), as we are using a constant amount of extra space.
//======================================================================
//approch 2: use a min heap priotity queue to find the kth largest element
    public int findKthLargestUsingHeap(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
//time complexity: O(n log k), where n is the length of the array. We traverse the array once and perform heap operations, which take O(log k) time.
//space complexity: O(k), as we are using a min heap of size k. 
    public static void main(String[] args) {
        find_kth_large_element solution = new find_kth_large_element();
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(solution.findKthLargest(nums, k)); // Output: 5
        System.out.println(solution.findKthLargestUsingHeap(nums, k)); // Output: 5
    }
}

