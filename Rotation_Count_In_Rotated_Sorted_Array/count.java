package Rotation_Count_In_Rotated_Sorted_Array;

public class count {
    public static void main(String[] args) {
        int[] nums = { 2, 4, 5, 6, 7, 0, 1 };
        int ans = RotationCount(nums);
        System.out.print("The count of rotation is: " + ans);
        // ans will be (pivot+1)

    }

    static int RotationCount(int[] arr) {
        int Pivot = pivot(arr);
        return Pivot + 1;
    }

    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (start < mid && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }
}
