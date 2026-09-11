import java.util.PriorityQueue;

public class KthLargestElement {

    public static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> q = new PriorityQueue<>();

        // Add all elements to PriorityQueue
        for (int i = 0; i < nums.length; i++) {
            q.add(nums[i]);
        }

        // Remove the smallest elements
        for (int i = 0; i < nums.length - k; i++) {
            q.poll();
        }

        // The remaining smallest element is the kth largest
        return q.poll();
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        int answer = findKthLargest(nums, k);

        System.out.println("Kth Largest Element: " + answer);
    }
}