import java.util.*;

public class MinimumStartValueCalculator {

    public static int minStartValue(int[] nums) {

        int sum = 0;
        int minSum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            minSum = Math.min(minSum, sum);
        }

        return 1 - minSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int result = minStartValue(nums);
        System.out.println(result);

        sc.close();
    }
}