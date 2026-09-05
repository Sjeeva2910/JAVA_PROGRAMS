public class JumpGame {///leetcode refer panu

    public static boolean canJump(int[] nums) {

        int number = nums[0];

        for (int i = 1; i < nums.length; i++) {
            number--;

            if (number <= nums[i] && number >= 0) {
                number = nums[i];
            }
        }

        if (number < 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 1, 4};

        System.out.println(canJump(nums));
    }
}