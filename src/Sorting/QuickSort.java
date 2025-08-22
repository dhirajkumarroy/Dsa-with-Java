package Sorting;

public class QuickSort {

    static void Swap(int []arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

    }
    static void displayArr(int[]arr){
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []arr = {2,9,6,9,3,5};
        displayArr(arr);
        Swap(arr,0,5);
        displayArr(arr);
    }
}
