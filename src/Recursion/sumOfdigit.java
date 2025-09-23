package Recursion;

public class sumOfdigit {

    public static int SOD(int n){

        if(n >= 0 && n <= 9){
            return n;
        }

        return SOD(n/10)+n%10;
    }
    public static void main(String[] args) {

        int num= 12345;
        System.out.println(SOD(num));
    }
}
