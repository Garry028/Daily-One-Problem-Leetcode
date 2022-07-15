
// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

/*  
brute force approach
    Time: O(n^2)
    Space: O(n)
    
    for each number, find the number of smaller numbers in the array:
        for each number in the array, if the number is smaller than the current number, increment the count
        return the count
    
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                // nums[j] means remaining elements of the array if they are less than the current element the increament the counter
                if(nums[j]<nums[i] && j!=i)
                {
                    count++;
                }
            }
            ans[i]=count;// store the count in the new array
        }
        return ans;// return that array
    }
}

*/

/*

 Optimised approach:
    Time:  O(n)
    Space: O(n)
    
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
      int [] ans = new int [nums.length];
        int[]temp= new int [101];
        // for frequency
        for(int i=0;i<nums.length;i++)
        {
            temp[nums[i]]++;
        }
        // for the running sum
        for(int i=1;i<101;i++)
        {
            temp[i]=temp[i]+temp[i-1];
        }
        // for storing result
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                ans[i]=0;
            }
            else{
                ans[i]=temp[nums[i]-1];
            }
        }
        return ans;
    }
}
*/