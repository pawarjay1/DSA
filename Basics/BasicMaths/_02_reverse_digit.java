package Basics.BasicMaths;

public class _02_reverse_digit {

    static int reverse(int x) {

        int n = Math.abs(x); // abs() used to get the absolute (positive) value of a number.
        int rev = 0;

        while (n > 0) {
            // get the last digite of n
            int last_digit = n % 10;

            // remove last_digit from the n by dividing n.
            n = n / 10;

            // check the largest possible value of integer, if rev is larger than int size
            // then return 0
            if (rev > (Integer.MAX_VALUE - last_digit) / 10) {
                return 0;
            }

            rev = (rev * 10) + last_digit;

        }

        return (x < 0) ? (-rev) : rev; // return -rev if the the original value if nagative else return positive rev
    }

    public static void main(String[] args) {

        int x = -12345; // -54321

        int result = reverse(x);

        System.out.println(result);

    }
}
