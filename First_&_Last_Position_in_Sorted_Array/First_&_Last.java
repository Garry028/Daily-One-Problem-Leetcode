class Solution {
    public int[] searchRange(int[] nums, int target) {
        // TC: O(logn)

        int[] ans = { -1, -1 };

        ans[0] = search(nums, target, true); // this for search in the left side of the array
        if (ans[0]!=-1) {
            ans[1] = search(nums, target, false); // this for search in the right side of the array
        }

        return ans;
    }

    int search(int[] nums, int target, boolean firstStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;// potential ans found but it may be possible that other ans is also there on
                          // left side of mid or right dside of mid

                if (firstStartIndex) // for left side
                {
                    end = mid - 1;
                } else {
                    start = mid + 1; // for right side
                }
            }
        }
        return ans;
    }
}