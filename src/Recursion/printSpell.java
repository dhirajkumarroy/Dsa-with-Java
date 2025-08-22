package Recursion;

import java.util.Scanner;

public class printSpell {

    static void printspell(int n,String[] str){

//        Base case
        if(n==0){
            return ;
        }

        printspell(n/10,str); // Recursive call

        int number = n%10;
        System.out.print(str[number]+" ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int newNum = sc.nextInt();



        String[] str = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

        printspell(newNum,str);
    }
}
