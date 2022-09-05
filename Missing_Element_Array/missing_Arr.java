package Missing_Element_Array;

// google que
import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // use cyclic sort
        List<Integer> list = new ArrayList<Integer>();

        int i = 0;

        while (i < nums.length) {
            int correct_index = nums[i] - 1;
            if (nums[i] != nums[correct_index]) {
                int temp = nums[i];
                nums[i] = nums[correct_index];
                nums[correct_index] = temp;
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                list.add(index + 1);
            }
        }
        return list;
    }
}