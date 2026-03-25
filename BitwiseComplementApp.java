import java.util.Scanner;

public class BitwiseComplementApp {

    // function to find complement
    public static int findComplement(int n) {

        if (n == 0) return 1;

        int mask = 0;
        int temp = n;

        // create mask (all 1's)
        while (temp > 0) {
            mask = (mask << 1) | 1;
            temp = temp >> 1;
        }

        return n ^ mask;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int result = findComplement(n);

        System.out.println("Complement = " + result);

        sc.close();
    }
}