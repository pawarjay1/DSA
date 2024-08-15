package Basics.BasicMaths;

public class Print_all_Divisors {
    public static void main(String[] args) {
        int n = 36; 
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                System.out.print(i+",");
            }
        }
    }
}
