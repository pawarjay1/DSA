package Basics.Recursion;

public class _03_1TOn {

    static void func(int n,int i){
        if(i>n){
            return; 
        }
        System.out.println(i);
        func(n,i+1); 

    }
    public static void main(String args[]){
        int n = 5; 

        func(n,1); 
    }
}
