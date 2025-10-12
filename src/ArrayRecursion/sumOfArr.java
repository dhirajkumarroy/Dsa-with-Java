package ArrayRecursion;

public class sumOfArr {

    static int sum_of_arr(int []arr, int idx){

        if(idx == arr.length){
            return 0;
        }

//        int sum = sum_of_arr(arr,idx+1);
        return arr[idx]+sum_of_arr(arr,idx+1);
//        return arr[idx]+sum;
    }

    public static void main(String[] args) {
        int []arr = {3,9,4,5,6,3};

        System.out.println("Sum of Array: "+sum_of_arr(arr,0));
    }
}
