import java.util.Arrays;

class Solution {

    public void sortColors(int[] nums) {

        int i = 0;
        int r = nums.length - 1;

        while(i <= r){

            if(nums[i] == 2){
                int temp = nums[i];
                nums[i] = nums[r];
                nums[r] = temp;
                r--;
            }
            else{
                i++;
            }
        }

        int l = 0;

        for(i=0;i<nums.length;i++){
            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[l];
                nums[l]=temp;
                l++;
            }
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {2,0,2,1,1,0};

        obj.sortColors(nums);

        System.out.println(Arrays.toString(nums));
    }
}