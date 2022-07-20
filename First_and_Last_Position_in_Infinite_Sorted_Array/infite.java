package First_and_Last_Position_in_Infinite_Sorted_Array;
// Amazon india question
public class infite {
    public static void main(String[] args) {
        int[] nums = { 3, 5, 7, 9, 10, 90, 100, 130,
                140, 160, 170, 180, 190, 200, 210, 220 };
        int target = 10;
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
