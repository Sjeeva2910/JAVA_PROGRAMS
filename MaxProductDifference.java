import java.util.*;

public class MaxProductDifference {

    public static int maxProductDifference(int[] nums) {
        int max1 = 0, max2 = 0;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for(int num : nums) {

            // find 2 largest
            if(num > max1) {
                max2 = max1;
                max1 = num;
            } else if(num > max2) {
                max2 = num;
            }

            // find 2 smallest
            if(num < min1) {
                min2 = min1;
                min1 = num;
            } else if(num < min2) {
                min2 = num;
            }
        }

        return (max1 * max2) - (min1 * min2);
    }

    public static void main(String[] args) {

        int nums[] = {5,6,2,7,4};

        int result = maxProductDifference(nums);

        System.out.println("Result: " + result);
    }
}