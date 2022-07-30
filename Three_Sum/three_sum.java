// class Solution {
//     List<List<Integer>> res = new ArrayList(); // in this list the ans list will be stored

//     public List<List<Integer>> threeSum(int[] nums) {
//         // a+b+c=0 hence b+c=0-a
//         Arrays.sort(nums);

//         for (int i = 0; i < nums.length; i++) {
//             // a is at index 0 hence it is fixed
//             // now apply the two sum on remaining space

//             // skip duplicate a
//             // when a is at 0th postion or or previous element is not equal to next till
//             // then no problem
//             if (i == 0 || nums[i - 1] != nums[i]) {
//                 twosum(i + 1, nums.length - 1, nums, 0 - nums[i]);
//             }
//         }
//         return res;
//     }

//     void twosum(int i, int j, int[] nums, int target) {
//         int a1 = nums[i - 1]; // this was fixed to first position

//         while (i < j) {
//             if (nums[i] + nums[j] > target) // if start + end is greater than the target the reduce the end by end--
//             {
//                 j--;
//             } else if (nums[i] + nums[j] < target) {
//                 i++;
//             } else {
//                 // we found the b & c
//                 List<Integer> list = new ArrayList();
//                 list.add(a1);
//                 list.add(nums[i]);
//                 list.add(nums[j]);

//                 res.add(list);

//                 // for skipping duplicate b
//                 while (i < j && nums[i] == nums[i + 1]) {
//                     i++;
//                 }
//                 // for skipping duplicate c
//                 while (i < j && nums[j] == nums[j - 1]) {
//                     j--;
//                 }

//                 // now check for another b & c for that just reduce the search space
//                 i++;
//                 j--;
//             }
//         }

//     }
// }