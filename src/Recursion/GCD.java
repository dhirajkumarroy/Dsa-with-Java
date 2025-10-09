package Recursion;

import java.util.Scanner;

public class GCD { // find gcd

    static int gcd(int x, int y){ // Euclidean algorithm
        if(y == 0){ // base case
            return x;
        }
        return gcd(y,x%y);
    }
    static int IGCD(int x, int y){

        while(x%y !=0){
            int rem = x%y;
             x = y;
             y =rem;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(IGCD(x,y));

        System.out.println(gcd(x,y));

    }
}
