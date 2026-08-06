import java.util.ArrayList;
import java.util.Scanner;

public class SumOfUniqueElements {

    public static int sumOfUnique(int[] nums) {

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> duplicate = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (!arr.contains(nums[i]) && !duplicate.contains(nums[i])) {
                arr.add(nums[i]);
            } else {
                arr.remove(Integer.valueOf(nums[i]));

                if (!duplicate.contains(nums[i])) {
                    duplicate.add(nums[i]);
                }
            }
        }

        int sum = 0;

        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int answer = sumOfUnique(nums);

        System.out.println("Sum of Unique Elements = " + answer);

        sc.close();
    }
}