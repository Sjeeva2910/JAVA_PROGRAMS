import java.util.*;

public class GoodTripletsCounter {

    public static int countGoodTriplets(int[] arr, int a, int b, int c) {

        int count = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                for(int k = j + 1; k < arr.length; k++){

                    int set1 = Math.abs(arr[i] - arr[j]);
                    int set2 = Math.abs(arr[j] - arr[k]);
                    int set3 = Math.abs(arr[i] - arr[k]);

                    if(set1 <= a && set2 <= b && set3 <= c){
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = countGoodTriplets(arr, a, b, c);
        System.out.println(result);

        sc.close();
    }
}