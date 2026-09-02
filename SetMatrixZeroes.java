import java.util.Arrays;

public class SetMatrixZeroes {

    public static void setZeroes(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        boolean[] zeroRow = new boolean[row];
        boolean[] zeroCol = new boolean[col];

        // Find all rows and columns containing zero
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (matrix[i][j] == 0) {
                    zeroRow[i] = true;
                    zeroCol[j] = true;
                }
            }
        }

        // Make rows zero
        for (int i = 0; i < row; i++) {
            if (zeroRow[i]) {
                for (int j = 0; j < col; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Make columns zero
        for (int j = 0; j < col; j++) {
            if (zeroCol[j]) {
                for (int i = 0; i < row; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };

        System.out.println("Before:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        setZeroes(matrix);

        System.out.println("\nAfter:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}