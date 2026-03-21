import java.util.*;

public class RemoveElementSimple {

    public static int removeElement(int[] nums, int val) {
        int k = 0;  // next position

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        int nums[] = {1,2,3,4,5,2};
        int val = 2;

        int k = removeElement(nums, val);

        System.out.println("k = " + k);
        System.out.print("Updated array: ");

        for(int i = 0; i < k; i++){
            System.out.print(nums[i] + " ");
        }
    }
}