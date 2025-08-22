package Recursion;

import java.util.Scanner;

public class factorial {

    static int get_factorial(int n){
//        Base case
        if(n<=1){
            return 1;
        }

        return n * get_factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num: ");
        int newNum = sc.nextInt();

       int ans = get_factorial(newNum);

        System.out.println(ans);

    }
}
