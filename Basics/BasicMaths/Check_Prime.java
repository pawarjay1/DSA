package Basics.BasicMaths;

public class Check_Prime {
    public static void main(String[] args) {
        int n=13; 
        int counter=0; 
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                counter++; 
            }
        }
        if(counter == 2){
            System.out.println("this number is prime !");
        }else{
            System.out.println("this number is not prime !");
        }
        
    }
}
