package Basics.BasicMaths;

// An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

public class _04_Armstrong_Numbers {

    static boolean solution(int n){

        int dup = n; 
        int k = String.valueOf(n).length(); 
        int sum = 0;

        while(dup>0){
            int last_digit = dup%10; 
            sum += Math.pow(last_digit,k); 
            dup/=10; 
        }

        return (n==sum) ? true : false; 
    }
    public static void main(String[] args) {
        int n = 153;

        boolean result = solution(n); 

        if(result == true){
            System.out.println("number is armstrong !");
        }else{
            System.out.println("number is not armstrong !");
        }
    }
}
