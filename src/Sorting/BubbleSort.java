// Bubble sort

package Sorting;

import java.util.Scanner;

public class BubbleSort {

    static  void SwapedNum(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
    }
    static void bubbleSort(int[] arr, int size){
        int temp;
        for(int i=0; i<arr.length-1;i++){
            for(int j=0; j<arr.length-i-1 ;j++){
                if(arr[j]>arr[j+1]){
//                    SwapedNum(arr[j],arr[j+1]);
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
    }
    static  void printArray(int[]arr){
        for(int num : arr){
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();

        int []arr = new int[size];
        System.out.print("Enter Array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Array are: ");
        for(int num: arr){
            System.out.print(num+" ");
        }

        System.out.print("\nSorted Array: ");
        bubbleSort(arr,size);
        printArray(arr);
    }
}
