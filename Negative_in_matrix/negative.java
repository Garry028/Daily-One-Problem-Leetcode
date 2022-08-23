package Negative_in_matrix;

public class negative {
    public static void main(String[] args) {
        int[][] grid = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };

        int ans = countNegatives(grid);

        System.out.println(ans);
    }

    static int countNegatives(int[][] grid) {

        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            int firstnegIndex = firstindex(grid, grid[i].length, i);
            sum = sum + (grid[i].length - firstnegIndex);
        }

        return sum;

    }

    static int firstindex(int[][] grid, int col, int row) {
        int start = row;
        int end = col - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (grid[row][mid] < 0) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (ans == -1) {

            return grid.length;
        } else {
            return ans;
        }

    }

}
