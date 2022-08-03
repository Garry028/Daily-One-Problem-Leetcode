// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.



// class Solution {
//     public boolean containsDuplicate(int[] nums) {
        
//     HashSet <Integer> numbers = new HashSet<>();
//         for(int i=0;i<nums.length;i++)
//         {
//             if(numbers.contains(nums[i]))
//             {
//                 return true;
//             }
//             numbers.add(nums[i]);
//         }
//         return false;
//     }
// }

// 1st of all create an hashset insert every element of array in hashset if the element is already present in the array then return true else insert that in the array