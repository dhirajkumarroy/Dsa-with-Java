package Recursion;

public class printDecreasingNum {
    public static void printDecreasing(int n){  // 5 4 3 2 1

        //Base case
        if(n==1){
            System.out.print(n+" ");
            return;
        }

        //Self work
        System.out.print(n+ " ");

        //recursive work
        printDecreasing(n-1);
    }

    public static void main(String[] args) {
        printDecreasing(5);
    }
}
