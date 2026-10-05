// Search a 2D Matrix
// lc link : https://leetcode.com/problems/search-a-2d-matrix/description/
public class Search_a_2D_Matrix_74 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int l1=0;
        int h1=matrix.length-1;
        int k=-1;
        while(l1<=h1){
            int mid = l1+(h1-l1)/2;
            if(matrix[mid][matrix[0].length-1] >= target ){
                h1 = mid-1;
                k = mid;
            }
            else
                l1 = mid+1;
        }
        if (k == -1)
            return false;
        int l = 0;
        int h = matrix[k].length-1;
        while (l<=h) {
            int mid = l+(h-l)/2;
            if(matrix[k][mid] == target)
                return true;
            if(matrix[k][mid] > target )
                h = mid-1;
            else
                l = mid+1;
        }
        return false;
    }
    // time : O(log(m*n))
    // space : O(1)
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        System.out.println(searchMatrix(matrix,target));
    }
}
