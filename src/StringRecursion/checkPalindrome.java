package StringRecursion;

import java.util.Scanner;

public class checkPalindrome {

    static boolean check_palindrome3(String st,int left,int right){

        if(left>=right){
            return true;
        }
        return (st.charAt(left) == st.charAt(right) && check_palindrome3(st,left+1,right-1));
    }
    static boolean check_palindrome2(String st){
        if(st.isEmpty()){
            return true;
        }

        String smallans = check_palindrome(st.substring(1));
        char ch = st.charAt(0);

        String ans = smallans + ch;

        if(st.equals(ans)){
            return true;
        }
        else{
            return false;
        }
    }
    static String check_palindrome(String str){
        if(str.isEmpty()){
            return "";
        }

        String smallans = check_palindrome(str.substring(1));
        char ch = str.charAt(0);

        return smallans + ch;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String st = sc.nextLine();

        if(st.equals(check_palindrome(st))){
            System.out.printf("%s is Palindrom", st);
        }
        else{
            System.out.printf("%st is not Palindrom", st);
        }

        System.out.println();
        System.out.println(check_palindrome2(st));
        System.out.println(check_palindrome3(st,0,st.length()-1));
    }
}
