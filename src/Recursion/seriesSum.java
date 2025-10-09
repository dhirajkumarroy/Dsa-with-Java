package Recursion;

import java.util.Scanner;

public class seriesSum {
    static int SOS(int n){ // series Sum of num
        if(n==0){
            return 0;
        }

        return SOS(n-1)+n;
    }

    static int SOAS(int n){ // sum of alternet Series

        if(n == 0){ // base case
            return 0;
        }

        if(n%2==0){ // if n is even
            return SOAS(n-1)-n;
        }
        else{ // if n is odd
            return SOAS(n-1)+n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Sum of Series: "+SOS(n));
        System.out.println("Sum of alternet Series: "+SOAS(n));
    }
}
