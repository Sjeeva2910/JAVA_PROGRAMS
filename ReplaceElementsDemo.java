import java.util.*;

public class ReplaceElementsDemo {

    public static int[] replaceElements(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            int max = -1;

            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] > max) {
                    max = arr[j];
                }
            }

            arr[i] = max;
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {17, 18, 5, 4, 6, 1};

        int[] result = replaceElements(arr);

        System.out.println("Output: " + Arrays.toString(result));
    }
}