import java.util.*;

public class DeciBinaryPartitionApp {

    public static int minPartitions(String n) {
        int max = 0;

        for (char c : n.toCharArray()) {
            int digit = c - '0';
            max = Math.max(max, digit);
        }

        return max;
    }

    public static void main(String[] args) {

        String n = "82734";  // sample input

        int result = minPartitions(n);

        System.out.println("Minimum deci-binary numbers needed: " + result);
    }
}