package StringRecursion;

import java.util.Scanner;

public class reverseOfStr {

    static String reverse_of_str2(String st,int idx){
        if(idx == st.length()){
            return "";
        }
        String smallans = reverse_of_str2(st,idx+1);
        char current = st.charAt(idx);
        return smallans + current;
    }
   static String reverse_of_str(String st){
       if(st.isEmpty()){
           return "";
       }
       String smallans = reverse_of_str(st.substring(1));
       char current = st.charAt(0); // char
       return smallans + current;  // char + String => String
   }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(reverse_of_str(str));
        System.out.println(reverse_of_str2(str,0));

        System.out.println(str);
    }
}
