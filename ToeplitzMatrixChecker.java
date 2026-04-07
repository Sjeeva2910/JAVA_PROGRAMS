class ToeplitzMatrixChecker {

    public boolean isToeplitz(int[][] matrix) {

        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){

                if(matrix[i][j] != matrix[i-1][j-1]){
                    return false;
                }
            }
        }

        return true;
    }
}

public class Main {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 1, 2},
            {5, 4, 1}
        };

        ToeplitzMatrixChecker obj = new ToeplitzMatrixChecker();
        boolean result = obj.isToeplitz(matrix);

        System.out.println("Is Toeplitz Matrix? " + result);
    }
}