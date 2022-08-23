package Find_Pivot_Index;

public class Pivot {
    public static void main(String[] args) {

    }

    public int pivotIndex(int[] nums) {

        int TotalSum = 0;
        int leftSum = 0;

        // first calculate the total sum of the array O(n)
        for (int j = 0; j < nums.length; j++) {
            TotalSum = TotalSum + nums[j];
        }

        // another for left & right sum
        for (int i = 0; i < nums.length; i++) {
            int rightSum = TotalSum - nums[i] - leftSum; // simple logic

            if (leftSum == rightSum) {
                return i;
            }

            leftSum = leftSum + nums[i]; // update left sum if the pivot index is not found
        }

        return -1;
    }
}
