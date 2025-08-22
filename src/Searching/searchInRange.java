package Searching;

import java.util.Scanner;

public class searchInRange {
//    Searching in Range
    static int searchEle(int[] arr,int target,int fIndex,int lIndex){
        if(arr.length==0){
            return -1;
        }

        for(int index=fIndex ;index<=lIndex; index++){
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of arr: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter Array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Array are: ");
        for(int num: arr){
            System.out.print(num+" ");
        }

//        Enter the target value
        System.out.print("\nEnter target value: ");
        int target = sc.nextInt();

//        Enter Range value
        System.out.println("Enter Range value;");
        System.out.print("fIndex: ");
        int fIndex = sc.nextInt();
        System.out.print("lIndex: ");
        int lIndex = sc.nextInt();

        System.out.println("Element present at Index: "+searchEle(arr,target,fIndex,lIndex));
    }
}
