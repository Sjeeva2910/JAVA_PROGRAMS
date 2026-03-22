import java.util.*;

public class DuplicateZerosShift {

    public static void duplicateZeros(int[] arr) {

        int n = arr.length;

        for(int i = 0; i < n; i++){

            if(arr[i] == 0){

                // shift right
                for(int j = n - 1; j > i; j--){
                    arr[j] = arr[j - 1];
                }

                i++; // skip next position (duplicate zero already)
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {1,0,2,3,0,4,5,0};

        duplicateZeros(arr);

        System.out.println(Arrays.toString(arr));
    }
}