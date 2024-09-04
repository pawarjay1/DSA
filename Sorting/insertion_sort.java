package Sorting;

public class insertion_sort {

    static void sorting(int arr[], int n){
        for(int i=0; i<n-1; i++){
            int j=i; 

            while(j>0 && arr[j-1]>arr[j]){
                int temp; 
                    temp = arr[j]; 
                    arr[j] = arr[j-1]; 
                    arr[j-1] = temp; 
                    j--; 
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {14,9,15,12,6,8,13}; 
        int n = arr.length; 

        sorting(arr,n); 

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+",");
        }
    }
}
