import java.util.HashSet;

class FindDuplicate {

    public static int findDuplicate(int[] nums) {

        HashSet<Integer> arr = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {

            if(!arr.contains(nums[i])) {
                arr.add(nums[i]);
            }
            else {
                return nums[i];
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 4, 2, 2};

        System.out.println(findDuplicate(nums));
    }
}