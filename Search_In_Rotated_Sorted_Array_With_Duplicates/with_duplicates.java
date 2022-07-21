package Search_In_Rotated_Sorted_Array_With_Duplicates;

// public class with_duplicates {
//     public static void main(String[] args) {

//     }

//     public int search(int[] nums, int target) {
//         int pivot = findPivotWithDuplicates(nums);
//         // if no pivot is found, then the array is not rotated
//         if (pivot == -1)
//         // just do normal binary search
//         {
//             return binary_search(nums, target, 0, nums.length - 1);
//         }
//         // if pivot is found, you have found 2 asc sorted arrays, one before pivot and
//         // one after pivot
//         if (nums[pivot] == target) {
//             return pivot;
//         }
//         // if target is less than pivot, then search in the first array
//         if (target >= nums[0]) {
//             return binary_search(nums, target, 0, pivot - 1);
//         } else {
//             return binary_search(nums, target, pivot + 1, nums.length - 1);
//         }
//     }

//     static int binary_search(int[] arr, int target, int start, int end) {

//         while (start <= end) {

//             int mid = start + (end - start) / 2;// this is better way to find the mid

//             if (target < arr[mid])// lies in the left of mid
//             {
//                 end = mid - 1;
//             } else if (target > arr[mid])// lies in the right of the mid
//             {
//                 start = mid + 1;
//             } else// found element
//             {
//                 System.out.print("Element found at index: ");
//                 return mid;
//             }

//         }

//         return -1;
//     }

//     static int findPivotWithDuplicates(int[] arr) {
//         int start = 0;
//         int end = arr.length - 1;

//         while (start <= end) {
//             int mid = start + (end - start) / 2;
//             // 4 cases over here
//             if (mid < end && arr[mid] > arr[mid + 1]) // mid should be less tha end beacause for avoiding arrayoutofbounds exception
//             {
//                 return mid;
//             } else if (mid > start && arr[mid] < arr[mid - 1]) // mid should be greater than start beacause for avoiding
//                                                                // arrayoutofbounds exception
//             {
//                 return mid - 1;
//             }
//             // if the elements at middle,start,end are equal then just skip the duplicates
//             if (arr[start] == arr[mid] && arr[end] == arr[mid]) 
//             {
//                 // NOTE : what if these elements at start and end are the pivot??
//                 if(arr[start]>arr[start+1])
//                 {
//                     return start;  // if condition turns out to be true theen this is pivot
//                 }
//                 start++; // if not then just skip this element
//                 if(arr[end]<arr[end-1])
//                 {
//                     return end-1; // this is pivot
//                 }
//                 end--; // if not then just skip this element

//                 // left side is sorted pivot should be in the right side
//                 if(arr[start] < arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end]))
//                 {
//                     start=mid+1;
//                 }
//                 else
//                 {
//                     end=mid-1;
//                 }
//             }
//         }
//         return -1;
//     }
// }







//  This is leetcode problem 
// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

class Solution {
    public boolean search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);
        // if no pivot is found, then the array is not rotated
        if (pivot == -1)
        // just do normal binary search
        {
            return binary_search(nums, target, 0, nums.length - 1);
        }
        // if pivot is found, you have found 2 asc sorted arrays, one before pivot and
        // one after pivot
        if (nums[pivot] == target) {
            return true;
        }
        // if target is less than pivot, then search in the first array
        if (target >= nums[0]) {
            return binary_search(nums, target, 0, pivot - 1);
        } else {
            return binary_search(nums, target, pivot + 1, nums.length - 1);
        }
    }

    static boolean binary_search(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;// this is better way to find the mid

            if (target < arr[mid])// lies in the left of mid
            {
                end = mid - 1;
            } else if (target > arr[mid])// lies in the right of the mid
            {
                start = mid + 1;
            } else// found element
            {
                System.out.print("Element found at index: ");
                return true;
            }

        }

        return false;
    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) // mid should be less tha end beacause for avoiding arrayoutofbounds exception
            {
                return mid;
                
             } else if (mid > start && arr[mid] < arr[mid - 1]) // mid should be greater than start beacause for avoiding
                                                               // arrayoutofbounds exception
            {
                return mid - 1;
            }
            // if the elements at middle,start,end are equal then just skip the duplicates
            else if (arr[start] == arr[mid] && arr[end] == arr[mid]) 
            {
                // NOTE : what if these elements at start and end are the pivot??
                if(start < end && arr[start]>arr[start+1] )
                {
                    return start;  // if condition turns out to be true theen this is pivot
                }
                start++; // if not then just skip this element
                if(end > start && arr[end]<arr[end-1] )
                {
                    return end-1; // this is pivot
                }
                end--; // if not then just skip this element
            }
                // left side is sorted pivot should be in the right side
            else if(arr[start] <= arr[mid] || arr[mid]>arr[end])
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            
        }
        return -1;
    }
}



