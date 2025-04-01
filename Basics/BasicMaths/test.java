package Basics.BasicMaths;

public class test {

    static int reverse(int x) {

        int n = Math.abs(x);
        int rev = 0;

        while (n > 0) {
            int last_digit = n % 10; // gets the last digit

            n = n / 10;

            if (rev > (Integer.MAX_VALUE - last_digit) / 10) {
                return 0;
            }

            rev = (rev * 10) + last_digit;

        }

        return (x < 0) ? (-rev) : rev;
    }

    public static void main(String[] args) {
        int x = -12345;

        int result = reverse(x);

        System.out.println(result);

    }
}
