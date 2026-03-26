import java.util.*;

public class TransposeUsingArrayList {

    public static List<List<Integer>> transpose(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        List<List<Integer>> result = new ArrayList<>();
        
        // Step 1: create empty structure (n rows, m cols)
        for(int i = 0; i < n; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j < m; j++){
                row.add(0);
            }
            result.add(row);
        }
        
        // Step 2: fill values
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                result.get(j).set(i, matrix[i][j]);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        List<List<Integer>> result = transpose(matrix);

        // print result
        for(List<Integer> row : result){
            System.out.println(row);
        }
    }
}