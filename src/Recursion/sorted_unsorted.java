package Recursion;

import java.util.Scanner;

public class sorted_unsorted {
    static boolean checkSorted(int[] arr,int index){
        if(index >= arr.length){
            return true;
        }

        if(arr[index] < arr[index-1]){
            return false;
        }

        return checkSorted(arr,index+1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Arr: ");
        int size = sc.nextInt();
        System.out.print("Array Are: ");
        int []arr = new int[size];

        for(int i =0; i<size; i++){
             arr[i]= sc.nextInt();
        }

        boolean ans = checkSorted(arr,1);

        if(ans){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Unsorted");
        }
    }
}
