package Recursion;

public class printIncreasingNum {

    public static void printIncreasingNumber(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
       printIncreasingNumber(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {

        printIncreasingNumber(7);
    }
}
