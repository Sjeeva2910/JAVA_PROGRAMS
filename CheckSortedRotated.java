import java.util.*;

public class CheckSortedRotated {

    public static boolean check(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] <= nums[i+1]){
                continue;
            }
            else if(nums[i] > nums[i+1] && count == 0){
                count++;
            }
            else{
                return false;
            }
        }

        // circular check
        if(nums[nums.length - 1] > nums[0]){
            count++;
        }

        return count <= 1;
    }

    public static void main(String[] args) {

        int nums[] = {3,4,5,1,2};

        boolean result = check(nums);

        System.out.println("Is Sorted & Rotated: " + result);
    }
}