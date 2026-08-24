import java.util.ArrayList;

public class SumOfUniqueElements {

    public static int sumOfUnique(int[] nums) {

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> duplicate = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (!arr.contains(nums[i]) && !duplicate.contains(nums[i])) {
                arr.add(nums[i]);
            } 
            else {
                int number = nums[i];
                arr.remove(Integer.valueOf(number));
                duplicate.add(nums[i]);
            }
        }

        if (arr.size() == 0) {
            return 0;
        }

        int result[] = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }

        int sum = 0;

        for (int i = 0; i < result.length; i++) {
            sum = sum + result[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2};

        int answer = sumOfUnique(nums);

        System.out.println("Sum of unique elements = " + answer);
    }
}