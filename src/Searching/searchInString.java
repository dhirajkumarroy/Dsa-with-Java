package Searching;

import java.util.Scanner;

public class searchInString {
    static boolean searchString(String str, char ch){
        if(str.length()==0){
            return false;
        }


        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String Str: ");
        String str = sc.nextLine();

        System.out.print(str);

        int len = str.length();
        System.out.println("\n"+len);

        char[] ch = str.toCharArray();

        System.out.println(ch);
        for(char c:ch){
            System.out.print(c+" ");
        }

    }
}
