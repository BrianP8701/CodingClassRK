package Week3;

import java.util.Arrays;

public class Homework3 {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 5, 3, 7, 4, 2, 1, 99, 6, 3, 2},
                {4, 5, 1, 5, 7, 3, 1, 55, 8, 2, 4}
        };
        robber(17, matrix);
    }

    public static int robber(int max, int[][] matrix){
        /**
         * We want to try every possible combination
         *  Base Cases:
         *  - If we exceed max capacity
         *  - If we reach the end of the array
         *
         *  Return the most money the robber can walk away with
         **/
        return robberHelper(max, matrix, 0);
    }

    /**               7
     * W    V
     * 3    5
     * 4    5
     * 6    10       6/10
     * 7    11       7/11
     *
     */





    public static int robberHelper(int spaceLeft, int[][] matrix, int money){
        // Base cases
        if(spaceLeft == 0) return money;
        if(matrix[0].length == 0) return money;

        System.out.println("Weight: " + matrix[0][0] + " Value: $" + matrix[1][0]);

        int[] nextWeight = Arrays.copyOfRange(matrix[0], 1, matrix[0].length);
        int[] nextValue = Arrays.copyOfRange(matrix[1], 1, matrix[1].length);
        int[][] newMatrix = {nextWeight, nextValue};
        // If the robber can fit the next item in his bag,
        if(matrix[0][0] <= spaceLeft) {
            // We have two choices, we can take the item, or leave it
            int a = robberHelper(spaceLeft - matrix[0][0], newMatrix, money + matrix[1][0]);
            int b = robberHelper(spaceLeft, newMatrix, money);
            return a > b ? a : b;
        } else {
            // We only have one choice, to skip this item
            return robberHelper(spaceLeft, newMatrix, money);
        }
    }
}
