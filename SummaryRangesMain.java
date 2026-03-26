import java.util.*;

public class SummaryRangesMain {

    public static List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();
        if(nums.length == 0) return result;

        int start = nums[0];
        int end = nums[0];

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] == end + 1) {
                end = nums[i]; // continuous
            } else {

                if(start == end) {
                    result.add(start + "");
                } else {
                    result.add(start + "->" + end);
                }

                start = nums[i];
                end = nums[i];
            }
        }

        // last range add
        if(start == end) {
            result.add(start + "");
        } else {
            result.add(start + "->" + end);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {0,1,2,4,5,7};

        List<String> ans = summaryRanges(nums);

        System.out.println(ans);
    }
}