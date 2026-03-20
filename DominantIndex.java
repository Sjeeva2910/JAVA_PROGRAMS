import java.util.*;

public class DominantIndex {

    public static int dominantIndex(int[] nums) {
        int largest = nums[0];
        int index = 0;

        // find largest + index
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
                index = i;
            }
        }

        // check condition
        for(int i = 0; i < nums.length; i++){
            if(i == index) continue;  // skip max element

            if(largest < 2 * nums[i]){
                return -1;
            }
        }

        return index;
    }

    public static void main(String[] args) {

        int nums[] = {3,6,1,0};

        int result = dominantIndex(nums);

        System.out.println("Dominant Index: " + result);
    }
}