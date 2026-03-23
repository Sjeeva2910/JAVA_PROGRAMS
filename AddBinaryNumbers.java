import java.util.*;

public class AddBinaryNumbers {

    public static String addBinary(String a, String b){

        String result = "";
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while(i >= 0 || j >= 0 || carry == 1) {

            int sum = carry;

            if(i >= 0)
                sum += a.charAt(i--) - '0';

            if(j >= 0)
                sum += b.charAt(j--) - '0';

            result = (sum % 2) + result; // current digit
            carry = sum / 2; // carry
        }

        return result;
    }

    public static void main(String[] args) {

        String a = "1010";
        String b = "1011";

        String result = addBinary(a, b);

        System.out.println("Result: " + result);
    }
}