package Searching;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {
    int binarySearch(int[] arr, int key){
        int low = 0, high = arr.length-1;
        if(arr.length==1){
            return 0;
        }
        while(low<=high){
            int mid = low + (high - low)/2;

            if(arr[mid] == key){
                return mid;
            }

            if(arr[mid] < key){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter Array: ");
        for(int i=0;i<arr.length;i++){
           arr[i] = sc.nextInt();
        }

        System.out.print("Array are: ");
        for(int num: arr){
            System.out.print(num+" ");
        }

        System.out.print("\nkey value: ");
        int key = sc.nextInt();

        BinarySearch obj = new BinarySearch();
        int result = obj.binarySearch(arr,key);

        if(result == -1){
            System.out.print("Element is not present in Array:");
        }
        else
            System.out.print("Element present at: "+result);
    }
}
