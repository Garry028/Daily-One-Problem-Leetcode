// This is brute force approach TC -> O(n^2) &  SC -> O(1)
// class Solution {
//     public int numIdenticalPairs(int[] nums) {
//         int pairs=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             for(int j=0;j<nums.length;j++)
//             {
//                 if(nums[i]==nums[j] && i<j)
//                 {
//                     pairs++;
//                 }
//             }
//         }
//         return pairs;
//     }
// }

// This is optimised solution with TC -> O(n) & SC -> O(1)
class Solution {
    public int numIdenticalPairs(int[] nums) {

        int[] temp = new int[101];

        int pairs = 0;// initially pairs count will be zero

        for (int i = 0; i < nums.length; i++) {

            pairs = pairs + temp[nums[i]]; 

            temp[nums[i]]++;

            // count every number how many times it occurs in the array and made changes in the temp array
        }
        return pairs;
    }
}