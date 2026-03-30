import java.util.*;

class NumArray {
    int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {

        if (left < 0 || right >= nums.length || left > right) {
            System.out.println("Invalid range");
            return 0;
        }

        int sum = 0;

        for (int i = left; i <= right; i++) {
            sum += nums[i];
        }

        return sum;
    }
}

public class RangeQueries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        NumArray obj = new NumArray(arr);

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {

            int left = sc.nextInt();
            int right = sc.nextInt();

            int result = obj.sumRange(left, right);
            System.out.println(result);
        }
    }
}