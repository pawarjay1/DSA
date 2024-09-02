
// it selects the minimums and swap it with first elements

package Sorting;

public class selection_sort {

    static void selection(int arr[], int n) {
        for (int i = 0; i <= (n - 2); i++) {
            int min = i;
            for (int j = i; j <= (n - 1); j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }

            }
            int temp;
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
    }

    public static void main(String args[]) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        int n = arr.length;

        selection(arr, n);

        System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
