public class Special_Positions_in_a_Binary_Matrix_1582 {
    public int numSpecial(int[][] mat) {
       int rowcount[]=new int[mat.length];
       int count=0;
       int colcount[]=new int[mat[1].length];
       for(int i=0;i<mat.length;i++)
       {
        for(int j=0;j<mat[i].length;j++)
        {
            if(mat[i][j]==1)
            {
                rowcount[i]++;
                colcount[j]++;
            }
        }
       }
       for(int i=0;i<mat.length;i++)
       {
        for(int j=0;j<mat[i].length;j++)
        {
            if(mat[i][j] == 1 && rowcount[i]==1 && colcount[j]==1)
            {
                count++;
            }
        }
       }
        return count;
    }
    public static void main(String[] args) {
        Special_Positions_in_a_Binary_Matrix_1582 obj=new Special_Positions_in_a_Binary_Matrix_1582();
        int[][] mat={{1,0,0},{0,0,1},{1,0,0}};
        System.out.println(obj.numSpecial(mat));
    }
    //time complexity: O(m*n), where m is the number of rows and n is the number of columns in the matrix. We traverse the entire matrix twice, once to count the number of 1s in each row and column, and once to check for special positions.
    //space complexity: O(m+n), where m is the number of rows and n is the number of columns in the matrix. We use two additional arrays to store the count of 1s in each row and column.
}
