// Image Smoother
// Given a 2D integer matrix M representing the gray scale of an image, you need to design a smoother to make the gray scale of each cell becomes the average gray scale (rounding down) of all the 8 surrounding cells and itself. If a cell has less than 8 surrounding cells, then use as many as you can.   
public class Image_Smoother_661 {
// Approach: For each cell in the matrix, we will check its 3x3 neighborhood (including itself) and calculate the average of the valid cells. We will store the result in a new matrix and return it.
// 1. Get the number of rows and columns.
// 2. Create a result matrix of the same size.
// 3. Visit every cell of the given matrix
// 4. For each cell, initialize sum = 0 and count = 0.
// 5. Check all rows from current row - 1 to current row + 1.
// 6. Check all columns from current column - 1 to current column + 1.
// 7. Check whether the neighboring row and column are within the matrix.
// 8. If valid, add its value to sum and increase count.
// 9. Ignore the cell if it is outside the matrix.
// 10. Calculate average = sum / count.
// 11. Store the average in the corresponding position of the result matrix.
// 12. Return the result matrix.
    public int[][] imageSmoother(int[][] img) {

        int m = img.length;
        int n = img[0].length;

        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                int sum = 0;
                int count = 0;

                // Check the 3x3 neighborhood
                for (int row = i - 1; row <= i + 1; row++) {

                    for (int col = j - 1; col <= j + 1; col++) {

                        // Check if the cell is valid
                        if (row >= 0 && row < m &&
                            col >= 0 && col < n) {

                            sum += img[row][col];
                            count++;
                        }
                    }
                }

                result[i][j] = sum / count;
            }
        }

        return result;
    }
// time complexity: O(m * n), where m is the number of rows and n is the number of columns in the input matrix. We iterate through each cell of the matrix and for each cell, we check its 3x3 neighborhood.
// space complexity: O(m * n), as we are using an extra matrix to store the result.
    public static void main(String[] args) {
        Image_Smoother_661 obj = new Image_Smoother_661();
        int[][] M = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        
        int[][] result = obj.imageSmoother(M);
        
        for (int[] result1 : result) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result1[j] + " ");
            }
            System.out.println();
        }
    }
}