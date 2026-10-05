// Search a 2D Matrix II
// lc link : https://leetcode.com/problems/search-a-2d-matrix-ii/description/
public class Search_a_2D_Matrix_II_240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int i = 0;
        int j = col - 1;
        while (i < row && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
    // time : O(m+n), where m is the number of rows and n is the number of columns in the matrix. In the worst case, we may need to traverse the entire matrix, which takes linear time.
    // space : O(1), as we are using a constant amount of extra space for variables.
    public static void main(String[] args) {    
        Search_a_2D_Matrix_II_240 solution = new Search_a_2D_Matrix_II_240();
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 5;
        System.out.println(solution.searchMatrix(matrix,target)); // Output: true
    }
}
