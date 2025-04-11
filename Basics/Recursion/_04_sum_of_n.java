package Basics.Recursion;

public class _04_sum_of_n {

    static void func(int n,int sum){
        if(n<1){
            System.out.println(sum);
            return; 
        }
        
        func(n-1,sum+n); // 5+0.... 5+4... 9+3... 12+2.... 14+1... 15 final ans. 
    }
    public static void main(String args[]){
        int n = 5; 
        int sum = 0; 
        func(n,sum);

    }
}
