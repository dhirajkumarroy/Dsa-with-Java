package Recursion;

public class CountOfDigit {

    static int COD(int n){
//       base case
        if(n==0){
            return 0;
        }
//       recursive work + self work
        return COD(n/10)+1;
    }
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(COD(num));
    }
}
