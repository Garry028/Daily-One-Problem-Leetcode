// https://leetcode.com/problems/build-array-from-permutation/


// This is brute force approch:  Time complexity is  O(n) & Space complexity is O(n)
package Build_Array_From_Permutation;

class Solution {
    public int[] buildArray(int[] nums) {
        int size = nums.length;// size of the array
        int[] ans = new int[size];// new answer array

        for(int i=0; i<nums.length;i++)
        {
            ans[i]=nums[nums[i]];// simply use the given formula
        }
        return ans;// return the ans and store in array
    }
}




// This is optimized solution because here we did not used the second array 

// class Solution {
//     public int[] buildArray(int[] nums) {
//         int size = nums.length;
//         for(int i=0; i<size;i++)
//         {
//             nums[i]=size*(nums[nums[i]]%size)+nums[i]; // formula
//         }
//         for(int i=0;i<size;i++)
//         {
              // this for getting the final array
//             nums[i]=nums[i]/size;
//         }
//         return nums;
//     }
// }