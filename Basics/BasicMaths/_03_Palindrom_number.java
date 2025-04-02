package Basics.BasicMaths;

public class _03_Palindrom_number {

    static boolean palindrom(int n) {

        int temp = Math.abs(n);
        int rev = 0;

        while (temp > 0) {
            int last_digit = temp % 10; // gets the last digit from the n

            temp = temp / 10; // remove the last digit.

            rev = (rev * 10) + last_digit;
        }

        return (rev == n) ? true : false;

    }

    public static void main(String[] args) {
        int n = -121;

        boolean result = palindrom(n);

        if (result == true) {
            System.out.println("number is palindrom!");
        } else {
            System.out.println("number is not palindrom!");
        }
    }
}
