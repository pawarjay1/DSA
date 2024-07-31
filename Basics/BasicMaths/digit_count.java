
// count digits 

package Basics.BasicMaths;

public class digit_count {

    static void count_number(int n){
        int counter = 0; 

        while(n>0){
            counter++; 
            n=n/10; 
        }
        System.out.println(counter);
    }
    public static void main(String[] args) {
        int n = 12345; 
        
        count_number(n); 
    }
}
