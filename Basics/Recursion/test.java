package Basics.Recursion;

public class test {

    static int func(int n,int counter){
        if(n<0){
            return 0;  //base condition 
        }
        System.out.println(n);
        return func(n,n-1); 
    }
    public static void main(String[] args) {
        int n = 10; 

        func(n,n+1); 
    }
}
