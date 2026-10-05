// Count Negative Numbers in a Sorted Matrix
// lc link : https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/

public class Count_Negative_Numbers_in_a_Sorted_Matrix_1351 {
    // using binary search
    // time : O(nlogn)
    // space : O(1)
    public static int countNegatives(int[][] grid) {
        int count=0;
        for (int[] grid1 : grid) {
            int l=0;
            int r = grid1.length - 1;
            int ans = grid1.length;
            while (l<=r) {
                int mid = l+(r-l)/2;
                if (grid1[mid] < 0) {
                    ans = mid;
                    r= mid-1;
                } else {
                    l = mid+1;
                }
            }
            count += grid1.length - ans;
        }   
        return count; 
    }
    public static void main(String[] args) {
        int[][] grid = {{4, 3, 2, -1}, {3, 2, 1, -1},
                {1, 1, -1, -2}, {-1, -1, -2, -3}};
        System.out.println(countNegatives(grid));
    }
    
}
