package Recursion;

public class sum_Of_N_Num {
    static void suOfN(int n){
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        suOfN(10);
    }
}
