public class MaximumProductSubarray {

    public static int maxProduct(int[] nums) {

        int currentMax = nums[0];
        int currentMin = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int temp = currentMax;

            currentMax = Math.max(nums[i],
                    Math.max(currentMax * nums[i], currentMin * nums[i]));

            currentMin = Math.min(nums[i],
                    Math.min(temp * nums[i], currentMin * nums[i]));

            result = Math.max(result, currentMax);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, -2, 4};

        int answer = maxProduct(nums);

        System.out.println("Maximum Product = " + answer);
    }
}