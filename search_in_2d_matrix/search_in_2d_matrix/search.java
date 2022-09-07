package search_in_2d_matrix;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 4, 7, 12, 15, 1000 }, { 2, 5, 19, 31, 32, 1001 }, { 3, 8, 24, 33, 35, 1002 },
                { 40, 41, 42, 44, 45, 1003 }, { 99, 100, 103, 106, 128, 1004 } };
        int target = 1000;
        System.out.println(Arrays.toString(searchMatrix(matrix, target)));
    }

    public static int[] searchMatrix(int[][] matrix, int target) {

        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            
            if (matrix[row][col] > target) {
                col--;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                return new int[] { row, col };
            }
        }
        return new int[] { -1, -1 };

    }
}
