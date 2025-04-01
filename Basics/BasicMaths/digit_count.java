
// count digits 

package Basics.BasicMaths;

public class digit_count {

    static void count_number(int n){
        int counter = 0; 
    
        while(n>0){
            counter++; 
            n=n/10;   // n = 1234.5
        }
        System.out.println(counter);
    }
    public static void main(String[] args) {
        int n = 123456; 
        
        count_number(n); 
    }
}


