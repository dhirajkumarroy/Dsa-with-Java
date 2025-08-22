package Recursion;

import java.util.Scanner;

public class fibonacci_num {

    static int fibonacci_ser(int n){
        if(n==0|| n==1){
            return n;
        }
        return  fibonacci_ser(n-1) + fibonacci_ser(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter term: ");
        int term = sc.nextInt();

        int  ans = fibonacci_ser(term);
        System.out.println(ans);

    }
}
