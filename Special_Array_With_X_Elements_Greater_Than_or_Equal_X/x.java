package Special_Array_With_X_Elements_Greater_Than_or_Equal_X;

public class x {
    public int specialArray(int[] nums) {

        for (int i = 1; i < 1000; i++) {
            int count = 0;

            for (int num : nums) // for every element of the nums check whether the num is greater than i and
                                 // increament counter
            {
                if (num >= i) {
                    count++;
                }

            }
            // if the counter is equal to i then rerurn i
            if (i == count) {
                return i;
            }
        }
        return -1;
    }

}