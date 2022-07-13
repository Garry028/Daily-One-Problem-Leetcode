// package Kids With the Greatest Number of Candies;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

// class Solution {
//     public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//          // candies[i] + extraCandies ≥ maximum in Candies[i].
//         int max = 0;
//         for(int i=0;i<candies.length;i++)
//         {
//             max=Math.max(max,candies[i]);
//         }
        
        
//         ArrayList <Boolean> ans = new ArrayList<>();// this is for storing the boolean array
//         for(int i=0;i<candies.length;i++)
//         {
//             int value = candies[i] + extraCandies;
            // if(value>=max)
            // {
            //     ans.add(true);
            // }
            // else{
            //     ans.add(false);
            // }

          //  // ans.add(value>=max);// this is short cut without using the if else
//         }
//         return ans;
// }
// }

// TC->O(n)  SC ->O(n)