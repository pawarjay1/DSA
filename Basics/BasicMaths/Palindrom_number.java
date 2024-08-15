package Basics.BasicMaths;

public class Palindrom_number {

    static int palindrom(int n){

        int N = n; 
        
        int rev = 0; 

        while(N>0){
            int last_digit = N%10; 
            rev = (rev*10) + last_digit; 
            N/=10; 
        }

        if(n == rev){
            return 1; 
        }
        else{
            return 0; 
        }

    }
    public static void main(String[] args) {
        int n = -121; 

        int result = palindrom(n);
        
        // System.out.println(result);

        if(result==1){
            System.out.println("number is palindrom!");
        }else{
            System.out.println("number is not palindrom!");
        }
    }
}
