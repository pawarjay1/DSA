package Basics.Recursion;

public class test {

    static int func(int n,int counter){
        counter=0; 
        if(n<0){
            return 0;  //base condition 
        }
        System.out.println(n);
        return func(n,counter+1); 
    }
    public static void main(String[] args) {
        int n = 10; 

        func(n,counter); 
    }
}
