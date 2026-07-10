class Solution {
    int[][] arr = new int[200][200];

    public int longestIncreasingPath(int[][] matrix) {
        int max1 = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (chackUp(matrix, i, j)) {

                    int temp = i - 1;
                    int max2 = 1 + travel(matrix, temp, j, 0);
                    if (max1 < max2) {
                        max1 = max2;
                    }
                }
                if (chackLeft(matrix, i, j)) {

                    int temp = j - 1;
                    int max2 = 1 + travel(matrix, i, temp, 1);
                    if (max1 < max2) {
                        max1 = max2;
                    }
                }
                if (chackDown(matrix, i, j)) {

                    int temp = i + 1;
                    int max2 = 1 + travel(matrix, temp, j, 2);
                    if (max1 < max2) {
                        max1 = max2;
                    }
                }
                if (chackRight(matrix, i, j)) {
                    int temp = j + 1;
                    int max2 = 1 + travel(matrix, i, temp, 3);
                    if (max1 < max2) {
                        max1 = max2;
                    }
                }
            }
        }
        return max1;
    }

    boolean chackUp(int[][] matrix, int row, int col) {
        row--;
        if (row < 0) {
            return false;
        }
        int temp = row + 1;
        if (matrix[temp][col] >= matrix[row][col]) {
            return false;
        }
        return true;
    }

    boolean chackLeft(int[][] matrix, int row, int col) {
        col--;
        if (col < 0) {
            return false;
        }
        int temp = col + 1;
        if (matrix[row][temp] >= matrix[row][col]) {
            return false;
        }
        return true;
    }

    boolean chackDown(int[][] matrix, int row, int col) {
        row++;
        if (row > (matrix.length - 1)) {
            return false;
        }
        int temp = row - 1;
        if (matrix[temp][col] >= matrix[row][col]) {
            return false;
        }
        return true;
    }

    boolean chackRight(int[][] matrix, int row, int col) {
        col++;
        if (col > (matrix[row].length - 1)) {
            return false;
        }
        int temp = col - 1;
        if (matrix[row][temp] >= matrix[row][col]) {
            return false;
        }
        return true;
    }

    int travel(int[][] matrix, int i, int j, int ref) {

        try {
            if (arr[i][j] != 0) {
                return arr[i][j];
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        int max1 = 1;
        if (ref != 2 && chackUp(matrix, i, j)) {
            int temp = i - 1;
            int max2 = 1 + travel(matrix, temp, j, 0);
            if (max1 <= max2) {
                max1 = max2;
            }
        }
        if (ref != 4 && chackLeft(matrix, i, j)) {
            int temp = j - 1;
            int max2 = 1 + travel(matrix, i, temp, 1);
            if (max1 <= max2) {
                max1 = max2;
            }
        }
        if (ref != 0 && chackDown(matrix, i, j)) {
            int temp = i + 1;
            int max2 = 1 + travel(matrix, temp, j, 2);
            if (max1 <= max2) {
                max1 = max2;
            }
        }
        if (ref != 1 && chackRight(matrix, i, j)) {
            int temp = j + 1;
            int max2 = 1 + travel(matrix, i, temp, 4);
            if (max1 <= max2) {
                max1 = max2;
            }
        }
        try {

            arr[i][j] = max1;
        } catch (Exception e) {
            System.out.println(e);

        }
        return max1;
    }
}