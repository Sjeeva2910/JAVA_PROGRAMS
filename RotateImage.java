public class RotateImage {

    public void rotate(int[][] matrix) {

        ////first transpose 

        for(int i=0;i<matrix.length;i++){

            for(int j=i+1;j<matrix.length;j++){

                int temp=matrix[j][i];

                matrix[j][i]=matrix[i][j];

                matrix[i][j]=temp;

            }

        }

        ///now reverse

        for(int i=0;i<matrix.length;i++){

            int left=0;

            int right=matrix.length-1;

            while(left<right){

                int temp=matrix[i][right];

                matrix[i][right]=matrix[i][left];

                matrix[i][left]=temp;

                left++;

                right--;

            }

        }

    }

}