import java.util.*;

public class SortArrayByParityII {

    public static int[] sortArrayByParityII(int[] nums) {

        int result[] = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = 1;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] % 2 == 0){
                result[evenIndex] = nums[i];
                evenIndex += 2;
            }
            else{
                result[oddIndex] = nums[i];
                oddIndex += 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int nums[] = {4,2,5,7};

        int result[] = sortArrayByParityII(nums);

        System.out.println("Result: " + Arrays.toString(result));
    }
}