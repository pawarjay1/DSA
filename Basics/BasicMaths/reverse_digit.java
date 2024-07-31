package Basics.BasicMaths;

public class reverse_digit {
    static int reverse_number(int n){
        int last_digit; 
        int rev=0; 

        while(n>0){
            last_digit = n%10;
            // System.out.print(last_digit);
            rev=(rev*10)+last_digit; 
            n=n/10; 
        }
        return rev; 
    }
    public static void main(String[] args) {
        int n = 12345;

        int result = reverse_number(n);

        System.out.println(result);
    }
} 
