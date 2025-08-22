package Array_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class nameArraylist {
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<String>();

        name.add("Dhiraj");
        name.add("Niraj");
        name.add("Aditya");
        name.add("Aryan");
        System.out.println(name);

        name.add(1,"Kumar");
        System.out.println(name);

//        Access the items
        System.out.println(name.get(0));
        System.out.println(name.get(1));

//        change an item
        name.set(0,"dhiraj");
        System.out.println(name);

//        Remove an item
        name.remove(1);
        System.out.println(name);

//        size of Arraylist
        int size=name.size();
        System.out.println(size);

//        to Remove all element in ArrayList
//        name.clear();
//        System.out.println(name);

//        loop through array list
        for(int i= 0 ;i<name.size();i++){
            System.out.print(name.get(i)+" ");
        }

//        for each loop
        System.out.println();
        for(String str: name){
            System.out.print(str+" ");
        }
//     Sort Arraylist

        System.out.println("\nArray Sort");
        Collections.sort(name);
        for(String str : name){
            System.out.print(str+ " ");
        }

//        new ArrayList Creation
        ArrayList<Integer> num = new ArrayList<Integer>();

        num.add(10);
        num.add(100);
        num.add(90);
        num.add(40);
        num.add(50);

        Collections.sort(num) ;
        System.out.println();
        for(int n : num){
            System.out.print(n + " ");
        }

    }
}
