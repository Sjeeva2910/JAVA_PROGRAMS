import java.util.*;

public class LuckyNumberMatrix {

    public static List<Integer> luckyNumbers(int[][] matrix) {

        Set<Integer> rowMin = new HashSet<>();
        Set<Integer> colMax = new HashSet<>();

        int m = matrix.length;
        int n = matrix[0].length;

        // Row minimum
        for (int i = 0; i < m; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            rowMin.add(min);
        }

        // Column maximum
        for (int j = 0; j < n; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                max = Math.max(max, matrix[i][j]);
            }
            colMax.add(max);
        }

        // Intersection
        List<Integer> result = new ArrayList<>();
        for (int num : rowMin) {
            if (colMax.contains(num)) {
                result.add(num);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {3, 7, 8},
            {9, 11, 13},
            {15, 16, 17}
        };

        List<Integer> ans = luckyNumbers(matrix);

        System.out.println("Lucky Numbers: " + ans);
    }
}