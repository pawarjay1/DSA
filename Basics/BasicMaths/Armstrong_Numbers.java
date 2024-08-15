package Basics.BasicMaths;

public class Armstrong_Numbers {

    static int solution(int n){
        int N = n; 
        int k = String.valueOf(n).length(); 
        int sum = 0; 
        while(N>0){
            int last_digit = N%10; 
            sum += Math.pow(last_digit,k); 
            N/=10; 
        }
        if(n == sum){
            return 1;
        }else{
            return 0; 
        }
    }
    public static void main(String[] args) {
        int n = 35;

        int result = solution(n); 

        if(result == 1){
            System.out.println("number is armstrong !");
        }else{
            System.out.println("number is not armstrong !");
        }
    }
}
