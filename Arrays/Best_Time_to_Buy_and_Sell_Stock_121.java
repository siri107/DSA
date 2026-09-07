// best time to buy and sell stock
// leetcode problem: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// approach 1: using brute force to check all pairs of prices and return the maximum profit. This would have a time complexity of O(n^2) and a space complexity of O(1).
public class Best_Time_to_Buy_and_Sell_Stock_121 {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        for(int i=0;i<prices.length;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                if(prices[j]-prices[i]>maxprofit)
                {
                    maxprofit=prices[j]-prices[i];
                }
            }
        }
        return maxprofit;  
    }
    // my approach
    public int maxProfit1(int[] prices) {
        int max=0;
        int min=prices[0];
        int idx=0,res=0;  
        for(int i=0;i<prices.length;i++)
        {
            if(min>prices[i])
            {
                min=prices[i];
                idx=i;
            }      
        } 
        for(int j=idx;j<prices.length;j++)
        {
            if(max<prices[j])
                max=prices[j];
        }   
        if(max>0)
            res=max-min;
        return res; 
    }
    //time complexity: O(n^2), where n is the length of the input array. We have two nested loops that iterate through the array to find the maximum profit.
    //space complexity: O(1), as we are using a constant amount of extra space  
    // it is wrong because it is not considering the case when the minimum price is not at the beginning of the array and the maximum price is not at the end of the array. It only considers the minimum price and maximum price in the entire array, which may not give the correct result. For example, if the input array is [7,1,5,3,6,4], the minimum price is 1 and the maximum price is 6, but the maximum profit can be obtained by buying at 1 and selling at 5, which gives a profit of 4. However, this approach will return a profit of 5 (6-1), which is incorrect.
    //approach 2: using a single pass to find the minimum price and maximum profit
    public int maxProfit3(int[] prices) {
        int min=prices[0];
        int maxprofit=0,profit;
        for(int i=0;i<prices.length;i++)
        {
            if(min>prices[i])
                min=prices[i];
            profit=prices[i]-min;
            if(profit>maxprofit)
            {
                maxprofit=profit;
            }
        }
        return maxprofit;
    }
    //time complexity: O(n), where n is the length of the input array. We iterate through the array once to find the minimum price and maximum profit.
    //space complexity: O(1), as we are using a constant amount of extra space
    public static void main(String[] args) {
        Best_Time_to_Buy_and_Sell_Stock_121 obj = new Best_Time_to_Buy_and_Sell_Stock_121();
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Maximum profit (approach 1): " + obj.maxProfit(prices)); // Output: 5
        System.out.println("Maximum profit (approach 2): " + obj.maxProfit3(prices)); // Output: 5
    }
}
