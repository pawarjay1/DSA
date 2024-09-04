
// if number is large then swap with next higher index 

package Sorting;

public class bubble_sort {

    static void sorting(int arr[], int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // int arr[] = {13,46,24,52,20,9};
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        sorting(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
