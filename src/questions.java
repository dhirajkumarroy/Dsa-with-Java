import kotlin.text.UStringsKt;

import java.util.Scanner;

public class questions {

    static int [] reverse(int []arr){
        int [] arr2 = new int[arr.length];

        int len =arr.length;

        while(len<0){
            int i=0;
            arr2[i] = arr[len];
            len--;
            i++;
        }
        return  arr2;
    }




    static int wordcount(String str){

        if(str.length()==1 || str.length()==2){
            return 1;
        }

        int count=0;

        char [] ch = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(str.length() - 1 - i); // reverse order
        }


        for(char ch1 :ch){
            if(ch1==' '&& count==0){
                continue;
            }
            count++;
            if(count>0 && ch1==' '){
                break;
            }

        }

        return count-1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        System.out.println(str.length());

        System.out.println(wordcount(str));


        int [] arr = {2,3,4,5};


    }
}
