import java.util.*;

public class FindMissingElements {

    public static List<Integer> findMissingElements(int[] nums) {

        Arrays.sort(nums);

        int starting = nums[0];
        int ending = nums[nums.length - 1];

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = starting; i <= ending; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }

        return result;
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

        List<Integer> answer = findMissingElements(nums);

        System.out.println("Missing Elements = " + answer);

        sc.close();
    }
}