public class Jump {

    public static boolean canJump(int[] nums) {

        if(nums.length == 1){
            return true;
        }

        int stepsleft = nums[0];

        for(int i = 1; i < nums.length; i++){

            stepsleft--;

            if(stepsleft < 0){
                return false;
            }

            if(i == nums.length - 1){
                return true;
            }

            if(stepsleft <= nums[i]){
                stepsleft = nums[i];
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {2,3,1,1,4};

        boolean result = canJump(nums);

        System.out.println(result);
    }
}
