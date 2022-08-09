package Find_Minimum_in_Rotated_Sorted_Array;

public class min {
    public int findMin(int[] nums) {
        int ans = findPivot(nums);

        int value = nums[ans + 1];
        return value;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) // mid should be less tha end beacause for avoiding
                                                      // arrayoutofbounds exception
            {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) // mid should be greater than start beacause for avoiding
                                                               // arrayoutofbounds exception
            {
                return mid - 1;
            } else if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
