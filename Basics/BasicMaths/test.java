package Basics.BasicMaths;

public class test {
    static int Armstrong_Numbers(int n){

        int dup = n; 
        int sum = 0; 
        int result = 0; 
        while(dup>0){
            int last_digit = dup%10; 
            dup=dup/10; 
            sum = (last_digit)*3;
            result += sum; 
            // sum+=sum;   
        }

        // return (sum==n) ? true : false; 
         return result; 
    }
    public static void main(String[] args) {
        int n = 153; // is Amstrong number

        // boolean result = Armstrong_Numbers(n);

        int res = Armstrong_Numbers(n); 

        System.out.println(res);
        
        // System.out.println(result);

        // if(result == true){
        //     System.out.println("this number is armstrong");
        // }else{
        //     System.out.println("this number is not armstrong");
        // }
        
    }
}
