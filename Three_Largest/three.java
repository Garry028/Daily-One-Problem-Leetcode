package Three_Largest;

import java.util.*;

public class three {
    public static void main(String[] args) {

        int[] arr = { -1, -2, -3, -7, -17, -27, -18, -541, -8, -7, 7 };
        System.out.println(Arrays.toString(findThreeLargestNumbers(arr)));
    }

    public static int[] findThreeLargestNumbers(int[] array) {
        // Write your code here.
        int[] threeMaxx = new int[] { Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE };

        for (int num : array) {
            if (num > threeMaxx[2]) {
                threeMaxx[0] = threeMaxx[1];
                threeMaxx[1] = threeMaxx[2];
                threeMaxx[2] = num;
            } else if (num > threeMaxx[1]) {
                threeMaxx[0] = threeMaxx[1];
                threeMaxx[1] = num;

            } else if (num > threeMaxx[0]) {
                threeMaxx[0] = num;
            }
        }

        return threeMaxx;
    }

}
