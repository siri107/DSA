//Koko Eating Bananas
//https://leetcode.com/problems/koko-eating-bananas/
public class Koko_Eating_Bananas_875 {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for( int i=0;i< piles.length; i++) {
            max= Math.max(max,piles[i]);
        }
        for( int i=1;i<=max; i++) {
            int sum=0;
            for(int j=0;j<piles.length; j++) {
                sum+=Math.ceil((double)piles[j] / i);
            }
            if(sum<=h)
                return i;
        }
        return max;
    }
    // time : O(n*m), where n is the length of the array and m is the maximum value in the array. We traverse the array for each value from 1 to max, which takes O(n) time for each value.
    // space : O(1)
    public int minEatingSpeed1(int[] piles, int h) {
        int max=0;
        for( int i=0;i< piles.length; i++) {
            max= Math.max(max,piles[i]);
        }
        int l=1;
        int r=max;
        int ans=1;
        while(l<=r) {
            int mid=l+(r-l)/2;
            
            int sum=0;
            for(int j=0;j<piles.length; j++) {
                sum+=Math.ceil((double)piles[j] / mid);
            }
            if(sum<=h){
                r=mid-1;
                ans=mid;
            }    
            else
                l=mid+1;
        }
        return ans;
    } 
    // time : O(nlogm)
    // space : O(1)
    public static void main(String[] args) {
        Koko_Eating_Bananas_875 solution = new Koko_Eating_Bananas_875();
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        System.out.println(solution.minEatingSpeed(piles, h)); // Output: 4
        System.out.println(solution.minEatingSpeed1(piles, h)); // Output: 4
    }
}
