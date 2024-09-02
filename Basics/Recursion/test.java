package Basics.Recursion;

public class test {
    static int counter=0;
    static void func(){
         
        if(counter == 4)
            return; 
        System.out.println(counter);
        counter++; 
        func(); 
    }
    public static void main(String[] args) {
        func(); 
    }
}
