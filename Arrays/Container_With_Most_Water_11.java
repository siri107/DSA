// Container With Most Water
//leetcode problem link: https://leetcode.com/problems/container-with-most-water/

public class Container_With_Most_Water_11 {
    // optimized approach using two pointers to find the maximum area of water that can be contained. This would have a time complexity of O(n) and a space complexity of O(1).
    //time complexity: O(n), where n is the length of the input array. We have a single loop that iterates through the array to find the maximum area.
    //space complexity: O(1), as we are using a constant amount of extra space
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
    // brute force approach to find the maximum area of water that can be contained. This would have a time complexity of O(n^2) and a space complexity of O(1).
    public int maxAreaBruteForce(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int area = Math.min(height[i], height[j]) * (j - i);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        Container_With_Most_Water_11 obj = new Container_With_Most_Water_11();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(obj.maxArea(height)); 
        System.out.println(obj.maxAreaBruteForce(height)); 
    }
    
}
