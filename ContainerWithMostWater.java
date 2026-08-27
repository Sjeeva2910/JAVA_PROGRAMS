public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int left = 0;

        int right = height.length - 1;

        int maxWater = Integer.MIN_VALUE;

        while (left < right) {

            int height1 = Math.min(height[left], height[right]);

            int width = right - left;

            int water = height1 * width;

            if (water > maxWater) {
                maxWater = water;
            }

            if (height[left] < height[right]) {
                left++;
            } 
            else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        ContainerWithMostWater obj = new ContainerWithMostWater();

        int result = obj.maxArea(height);

        System.out.println("Maximum Water: " + result);
    }
}