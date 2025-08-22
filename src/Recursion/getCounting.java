package Recursion;

import java.util.Scanner;

public class getCounting {

    static  void get_Counting(int n){
        //Base case
        if(n==0){
            return;
        }
        get_Counting(n-1);

        System.out.print(n+" ");

//        get_Counting(n-1);
    }

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.print("Enter num: ");
        int newNum = sc.nextInt();

        get_Counting(newNum);

    }
}
