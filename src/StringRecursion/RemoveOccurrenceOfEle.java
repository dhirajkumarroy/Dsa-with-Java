package StringRecursion;

import java.util.Scanner;

public class RemoveOccurrenceOfEle {

    static String remove_occurrence_of_ele2(String str,char ch){
        if(str.isEmpty()){
            return " ";
        }

        String smallans = remove_occurrence_of_ele2(str.substring(1),ch);

        char current = str.charAt(0);

        if(current != ch){
            return current +smallans;
        }
        else{
            return smallans;
        }
    }

    static String remove_occurrence_of_ele(String st ,int idx,char ch){

       if(idx == st.length()){
           return "";
       }

       String small = remove_occurrence_of_ele(st,idx+1,ch);

       char current = st.charAt(idx);

       if(current != ch){
           return current + small;
       }
       else{
           return small;
       }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        System.out.println(remove_occurrence_of_ele(st,0,'a'));
        System.out.println(remove_occurrence_of_ele2(st,'a'));


    }

}
