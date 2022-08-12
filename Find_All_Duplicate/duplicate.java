package Find_All_Duplicate;

import java.util.*;

public class duplicate {
    public static void main(String[] args) {

    }

    public List<Integer> findDuplicates(int[] nums) 
    {
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

        for (int index = 0; index < nums.length; index++) { // here simply return element not index
            if (nums[index] != index + 1) {
                list.add(nums[index]);
            }
        }
        return list;  
    }
}
