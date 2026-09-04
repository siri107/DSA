//Richest Customer Wealth
//leetcode problem 1672
//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
//approach 1: Using two nested loops to calculate the sum of each customer's wealth and keeping track of the maximum wealth found so far.
public class Richest_customer_wealth {
    public int maximumWealth(int[][] accounts) {
        int max=0, sum;
        for(int i=0;i<accounts.length;i++)
        {
            sum=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                sum+=accounts[i][j];
            }
            if(sum>max)
                max=sum;
        }
        return max;
    }
    public static void main(String[] args) {
        Richest_customer_wealth obj=new Richest_customer_wealth();
        int[][] accounts={{1,2,3},{3,2,1}};
        System.out.println(obj.maximumWealth(accounts));
    }
}
