package Recursion;

import javax.naming.directory.SchemaViolationException;
import java.util.Scanner;

public class multipleOfNum {

    static void MON(int n, int k){
        if(k == 0){ // base case
//            System.out.println(n*1);
            return;
        }
        MON(n,k-1); // recursion

        System.out.print(n*k+ " "); // self work
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        MON(n,k);
    }
}
