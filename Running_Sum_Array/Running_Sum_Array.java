package Running_Sum_Array;
// https://leetcode.com/problems/running-sum-of-1d-array/


//brute force approach time complexity O(n^2),space complexity O(n)
// class Solution {
//     public int[] runningSum(int[] nums) {
//         int size=nums.length;
        
//         int [] ans=new int[size];// new array for storing the running sum
        
//         for(int i=0;i<size;i++)
//         {
//            for(int j=0;j<=i;j++)
//            {
//                ans[i]+=nums[j];
//            }
//         }
//         return ans;
//     }
// }



// class Solution {
//     public int[] runningSum(int[] nums) {
             
// optimised solution  TC -> O(n) and SC -> O(1)    
        
//         for(int i=1;i<nums.length;i++)
//         {
//            nums[i]+=nums[i-1];
//         }
//         return nums;
//     }
// }

