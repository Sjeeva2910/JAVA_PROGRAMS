import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int total = nums[i] + nums[j];
                if (total == target) {
                    result.add(i);
                    result.add(j);
                }
            }
        }

        int arr[] = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
        return arr;
    }
}

public class TwosumListmethod {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        int target = input.nextInt();

        Solution obj = new Solution();
        int[] result = obj.twoSum(nums, target);

        System.out.println("index1: " + result[0] + " index2: " + result[1]);
    }
}