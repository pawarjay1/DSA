package Basics.Recursion;

public class _01_n_name {
    static void func(int n, String name){

        // base condition 
        if(n<1){
            return; 
        }

        System.out.println(name+""+n);
        func(n-1,name); 

    }
    public static void main(String args[]){
        String name = "jay"; 
        int n = 5; 
        func(n,name); 
    }
}
