// package Shuffle_Array;

// https://leetcode.com/problems/shuffle-the-array/

/*  This is brute force approch  TC -> O(n) & SC -> O(n)

 class Solution {
     public int[] shuffle(int[] nums, int n) {
        
        // this is brute force approch TC -> O(n) SC -> O(n)
        
        //  n -> means total x & n -> means total y

        Input array  -> [x1,x2,x3.....,y1,y2,y3.....]
        Output array -> [x1,y1,x2,y2,x3,y3..........]

         int[] ans = new int[2*n];
        
         int j=0;
        
         for(int i=0;i<2*n;i=i+2)
         {
            ans[i]=nums[j];     // new array's -> x
            ans[i+1]=nums[j+n]; // new array's -> y
            j++;
         }
         return ans;
     }
 }

*/


