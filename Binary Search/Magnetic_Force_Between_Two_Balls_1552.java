// Magnetic Force Between Two Balls
// https://leetcode.com/problems/magnetic-force-between-two-balls/description/

import java.util.Arrays;

public class Magnetic_Force_Between_Two_Balls_1552 {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l=0;
        int h = Math.abs(position[0] - position[position.length-1]);
        int ans=h;
        while(l <= h) {
            int mid = l + (h - l) / 2;
            int c=1;
            int pos=0;
            for( int i=1; i<position.length ; i++) {
                if(Math.abs(position[i] - position[pos]) >=mid) {
                    c++;
                    pos = i;
                }
            }
            if( c >= m) {
                ans = mid;
                l=mid+1;
            }
            else
                h=mid-1;
        }  
        return ans; 
    }
    // time : O(nlogm), where n is the length of the array and m is the maximum value in the array. We perform a binary search on the range of possible distances, which takes O(logm) time, and for each distance, we traverse the array to count the number of balls that can be placed, which takes O(n) time.
    // space : O(1)
    public static void main(String[] args) {    
        Magnetic_Force_Between_Two_Balls_1552 solution = new Magnetic_Force_Between_Two_Balls_1552();
        int[] position = {1, 2, 3, 4, 7};
        int m = 3;
        System.out.println(solution.maxDistance(position, m)); // Output: 3
    }
}
