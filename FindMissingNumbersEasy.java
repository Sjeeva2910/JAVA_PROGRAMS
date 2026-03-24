import java.util.*;

public class FindMissingNumbersEasy {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        int n = nums.length;
        boolean[] seen = new boolean[n + 1];

        // mark numbers present
        for(int i = 0; i < n; i++){
            seen[nums[i]] = true;
        }

        // find missing numbers
        List<Integer> result = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(!seen[i]){
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {4, 3, 4, 7, 2, 3, 1};

        List<Integer> missing = findDisappearedNumbers(nums);

        System.out.println("Missing numbers: " + missing);
    }
}