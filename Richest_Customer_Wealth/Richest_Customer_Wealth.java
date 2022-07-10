package Richest_Customer_Wealth;

public class Richest_Customer_Wealth {
    public static void main(String[] args) {

    }
    // this is simply a problem in which we've to take the sum of rows then maxx summ will be rich 
    public int maximumWealth(int[][] accounts) {
        // person means row
        // account means column
        int max = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}