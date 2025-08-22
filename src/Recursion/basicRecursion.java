package Recursion;

public class basicRecursion {

    static void fun1(){
        System.out.println("Recursion");
//        fun1();
    }

    static void fun2(int n){
        if(n==0){
            return;
        }
        System.out.println(n + " Recursion");
        fun2(n-1);
    }

    static void fun3(int n){
        if(n==20){
            return;
        }
        System.out.print(n+" ");
        fun3(n+2);
    }
    public static void main(String[] args) {
        fun1();

        fun2(9);

        fun3(2);
    }
}
