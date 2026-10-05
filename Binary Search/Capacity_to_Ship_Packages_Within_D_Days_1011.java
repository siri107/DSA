// Capacity to Ship Packages Within D Days
// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
public class Capacity_to_Ship_Packages_Within_D_Days_1011 {
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        for( int i=0;i< weights.length; i++) {
            max= Math.max(max,weights[i]);
        }
        int sum=0;
        for( int i=0;i< weights.length; i++) {
            sum+=weights[i];
        }
        int l=max;
        int r= sum;
        int ans=max;
        while( l<=r ) {
            int mid= l+(r-l)/2;
            sum=0;
            int c=1;
            for(int i=0; i<weights.length; i++) {
                
                if(sum + weights[i] > mid){
                    c++;
                    sum= weights[i];
                }
                else 
                    sum += weights[i];
            }
            
            if(c <= days){
                r=mid-1;
                ans=mid;
            }    
            else
                l=mid+1;
        }
        return ans;
    }
    // time : O(nlogm), where n is the length of the array and m is the maximum value in the array. We perform a binary search on the range of possible capacities, which takes O(logm) time, and for each capacity, we traverse the array to count the number of days required, which takes O(n) time.
    // space : O(1)
    public static void main(String[] args) {
        Capacity_to_Ship_Packages_Within_D_Days_1011 solution = new Capacity_to_Ship_Packages_Within_D_Days_1011();
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        System.out.println(solution.shipWithinDays(weights, days)); // Output: 15
    }
}  