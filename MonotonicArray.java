import java.util.*;

public class MonotonicArray {

    public boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dec = true;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i+1]){
                dec = false;   
            }
            if(nums[i] > nums[i+1]){
                inc = false; 
            }
        }

        return inc || dec;
    }

    public static void main(String args[]){
        int nums[] = {1,2,2,3};

        MonotonicArray obj = new MonotonicArray();

        boolean result = obj.isMonotonic(nums);

        System.out.println("Is Monotonic: " + result);
    }
}