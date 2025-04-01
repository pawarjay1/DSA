package Basics.Recursion;

public class test {
    static void func(int i){

        // base condition 
        if(i<=0){
            return; 
        }

        System.out.println(i);
        func(i-1); 

    }
    public static void main(String args[]){
        func(4); 
    }
}
