package Basics.BasicMaths;    

public class test {

    static int revarse(int n){

        int N = Math.abs(n); 
        // int cnt=0;
        int rev = 0; 
        while(N>0){
            int last_digit = N%10; 
            rev = (rev*10) + last_digit; 
            N/=10; 
            // cnt++; 
        }
        if(n<0){
            return -rev; 
        } else{
            return rev; 
        }
    }
    public static void main(String[] args) {
        int n = 12345; 

        int result = revarse(n); 

        System.out.println(result);
    }
}
