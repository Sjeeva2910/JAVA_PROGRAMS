import java.util.Scanner;

public class NumberOfSteps {

    public static int numberOfSteps(int num) {
        int temp = num;
        int count = 0;

        while (temp != 0) {
            count++;

            if (temp % 2 == 0) {
                temp = temp / 2;
            } else {
                temp = temp - 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = numberOfSteps(num);

        System.out.println("Number of steps: " + result);

        sc.close();
    }
}