package StringRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class getSsq { // getting subsequence

    static ArrayList<String> get_ssq(String str){

        ArrayList<String> ans = new ArrayList<>();

        if(str.length() == 0){
            ans.add("");
            return ans;
        }

        char current = str.charAt(0);

        ArrayList<String> smallans = get_ssq(str.substring(1));

        for(String c: smallans){
            ans.add(c);
            ans.add(current + c);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        ArrayList<String> arr = get_ssq(str);


        for(String s : arr){
            System.out.print(s+" ");
        }

    }
}
