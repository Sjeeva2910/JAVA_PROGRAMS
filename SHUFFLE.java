import java.util.*;

public class SHUFFLE {

    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];

        for(int i = 0; i < n; i++) {
            res[2*i] = nums[i];
            res[2*i + 1] = nums[i+n];
        }

        return res;
    }

    public static void main(String[] args) {
        SHUFFLE obj = new SHUFFLE();

        int nums[] = {2,5,1,3,4,7};
        int n = 3;

        int result[] = obj.shuffle(nums, n);

        System.out.println(Arrays.toString(result));
    }
}