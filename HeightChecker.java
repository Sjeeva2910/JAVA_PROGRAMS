import java.util.*;

class HeightChecker {

    public int heightChecker(int[] heights) {

        int sortarray[] = heights.clone();
        Arrays.sort(sortarray);

        int count = 0;

        for(int i=0;i<heights.length;i++){
            if(sortarray[i] != heights[i]){
                count++;
            }
        }

        return count;
    }

    public static void main(String args[]){

        int heights[] = {1,1,4,2,1,3};

        HeightChecker obj = new HeightChecker();

        int result = obj.heightChecker(heights);

        System.out.println(result);
    }
}