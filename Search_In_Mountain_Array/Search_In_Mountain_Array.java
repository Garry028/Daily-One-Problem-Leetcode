// package Search_In_Mountain_Array;

// // leetcode hard
// //https://leetcode.com/problems/find-in-mountain-array/
// public class Search_In_Mountain_Array {
//     public static void main(String[] args) {

//     }

//     int search(int[] arr, int target) {
//         int peak = Peak_Index_In_Mountain_Array(arr);

//         int firstTry = order_agnostic_BS(arr, target, 0, peak - 1);
//         ;
//         if (firstTry != -1) {
//             return firstTry;
//         }
//         // otherwise try to search in the other part of the array
//         return order_agnostic_BS(arr, target, peak + 1, arr.length - 1);

//     }

//     public int order_agnostic_BS(int[] arr, int target, int start, int end) {

//         // find whether the array is sorted in ascending or descending
//         boolean isAscending;
//         if (arr[start] < arr[end]) {
//             isAscending = true;
//         } else {
//             isAscending = false;
//         }

//         boolean isDscending;
//         if (arr[start] > arr[end]) {
//             isDscending = true;
//         } else {
//             isDscending = false;
//         }

//         while (start <= end) {
//             int mid = start + (end - start) / 2;

//             if (arr[mid] == target) {
//                 System.out.print("Element found at index: ");
//                 return mid;
//             }

//             if (isAscending) {
//                 if (target < arr[mid]) {
//                     end = mid - 1;
//                 } else {
//                     start = mid + 1;
//                 }
//             }

//             if (isDscending) {
//                 if (target > arr[mid]) {
//                     end = mid - 1;
//                 } else {
//                     start = mid + 1;
//                 }
//             }

//         }

//         System.out.print("Element not found ");
//         return -1;
//     }

//     public int Peak_Index_In_Mountain_Array(int[] nums) {
//         int start = 0;
//         int end = nums.length - 1;
//         while (start < end) {
//             int mid = start + (end - start) / 2;
//             if (nums[mid] > nums[mid + 1])// this may be the ans but look at the left,you are in descending part
//             {
//                 end = mid;
//             } else {// this may be the ans but look at the right,you are in ascending part
//                 start = mid + 1;
//             }
//         }
//         // when the start is equal to end,it means you have found the ans
//         return start; // here we can return start or end beacause both are same

//     }
// }




// Leetcode need this format of the ans:

// class Solution {
//     int orderAgnosticBS(MountainArray arr, int target, int start, int end){
//         boolean isAsc = (arr.get(start) < arr.get(end));
        
//         while(start <= end){
//             int mid = start + (end - start) / 2;
//             if(arr.get(mid) == target){
//                 return mid;
//             }
//             if(isAsc){
//                 if(arr.get(mid) > target){
//                     end = mid - 1;
//                 }
//                 else{
//                     start = mid + 1;
//                 }
//             }
//             else{
//                 if(arr.get(mid) > target){
//                     start = mid + 1;
//                 }
//                 else{
//                     end = mid - 1;
//                 }
//             }
//         }
//         return -1;
//     }
    
//     public int findInMountainArray(int target, MountainArray mountainArr) {
//         int start = 0;
//         int end = mountainArr.length()-1;
        
//         while(start < end){
//             int mid = start + (end - start) / 2;
//             if(mountainArr.get(mid) > mountainArr.get(mid+1)){
//                 end = mid;
//             }
//             else{
//                 start = mid + 1;
//             }
//         }
        
//         int peakIdx = start;
//         int firstTry = orderAgnosticBS(mountainArr, target, 0, peakIdx);
//         if(firstTry != -1){
//             return firstTry;
//         }
//         return orderAgnosticBS(mountainArr, target, peakIdx+1, mountainArr.length()-1);
//     }
// }