import java.util.Scanner;

public class SmallestDivisibleDigitProduct {

    public static int smallestNumber(int n, int t) {

        while (true) {

            int temp = n;
            int product = 1;

            while (temp > 0) {
                int digit = temp % 10;
                product *= digit;
                temp = temp / 10;
            }

            if (product % t == 0) {
                return n;
            }

            n++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter t: ");
        int t = sc.nextInt();

        int answer = smallestNumber(n, t);

        System.out.println("Answer = " + answer);

        sc.close();
    }
}