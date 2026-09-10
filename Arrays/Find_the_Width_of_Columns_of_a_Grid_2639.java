// Find the Width of Columns of a Grid
// https://leetcode.com/problems/find-the-width-of-columns-of-a-grid/description/
import java.util.*;
public class Find_the_Width_of_Columns_of_a_Grid_2639 {
        public int[] findColumnWidth(int[][] grid) {
        int num, count, maxcount;
        int arr[]=new int[grid[0].length];
        for(int i=0;i<grid[0].length;i++)
        {
            maxcount=0;
            for(int j=0;j<grid.length;j++)
            {
                num= grid[j][i];
                if(num<=0)
                    count=1;
                else
                    count=0;
                while(num!=0)
                {
                    num=num/10;
                    count++;
                }
                
                if(count>maxcount)
                {
                    maxcount=count;
                    arr[i]=maxcount;
                }
            }
            
        }
        return arr;
    }
    //time complexity: O(m*n), where m is the number of rows and n is the number of columns in the grid. We have two nested loops that iterate through the grid to find the width of each column.
    //space complexity: O(n), where n is the number of columns in the grid.
    public static void main(String[] args) {
        Find_the_Width_of_Columns_of_a_Grid_2639 obj = new Find_the_Width_of_Columns_of_a_Grid_2639();
        int[][] grid = {{1,22,333},{4444,55555,666666},{7777777,88888888,999999999}};
        System.out.println(Arrays.toString(obj.findColumnWidth(grid))); 
    }
    
    
}
