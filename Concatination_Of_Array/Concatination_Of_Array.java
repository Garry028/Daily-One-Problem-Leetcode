package Concatination_Of_Array;
// https://leetcode.com/problems/concatenation-of-array/submissions/
class Solution {
    public int[] getConcatenation(int[] nums) {

        int size=nums.length;

        int[] ans = new int[2*size]; // new array size would be double of that old

        for(int i=0;i<size;i++)
        {
            ans[i]=nums[i];// initial array will be same 
            ans[i+size]=nums[i]; // then after same array will start filling
            
        }
        return ans;
    }
}
