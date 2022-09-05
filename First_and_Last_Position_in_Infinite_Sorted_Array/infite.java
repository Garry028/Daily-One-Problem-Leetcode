package First_and_Last_Position_in_Infinite_Sorted_Array;

// Amazon india question
public class infite {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 5, 6, 7, 8, 10, 14, 15, 20, 23, 30, 33, 35, 37, 39, 45, 47 };
        int target = 39;
        System.out.print("Element found at index: " + findRange(nums, target));

    }

    static int findRange(int[] arr, int target) {
        // find the range of the target in the array
        // first start with box or range of size 2
        int start = 0;
        int end = 1;
        // condition for the target to lie in the range

        while (target > arr[end]) {
            int newstart = end + 1;
            // double the box or range value
            // end = previous end + sizeOfBox*2
            // end-start + 1 means the size of the box or range
            end = end + (end - start + 1) * 2;
            start = newstart;

        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;

    }

}
