package Recursion;

public class ExponentOfNum {

//    static int EON(int n,int exp){
//
//        int ans =1;
//        for(int i=1;i<=exp;i++){
//            ans = ans*n;
//        }
//        return ans;
//    }

//     find exponent of number using recursion
    static int EON(int num, int exp){
//        Base case;
        if(exp==0){
            return 1;
        }
//       recursive work * self work;
        return EON(num,exp-1)*num;
    }
    public static void main(String[] args) {
        int base = 2;
        int exp = 5;
        System.out.println(EON(base,exp));
    }
}
