package Basics.BasicMaths;

public class test {
    static void divisor(int n){
        // int dup = n; 
        // int len = String.valueOf(n).length(); 

        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i);  
            }
           
        }
    }
    public static void main(String[] args) {
        int n = 36; 

        divisor(n); 

        // System.out.println(result);

    }
}
