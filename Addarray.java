import java.util.*;

class Addarray {

    public int[] getConcatenation(int[] nums) {

        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            result.add(nums[i]);
        }

        for(int i=0;i<nums.length;i++){
            if(result.contains(nums[i])){
                result.add(nums[i]);
            }
        }

        int[] total = new int[result.size()];

        for(int i=0;i<result.size();i++){
            total[i] = result.get(i);
        }

        return total;
    }

    public static void main(String args[]){

        int nums[] = {1,2,3};

        Addarray obj = new Addarray();

        int[] result = obj.getConcatenation(nums);

        System.out.println(Arrays.toString(result));
    }
}