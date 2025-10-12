package ArrayRecursion;

public class printArray {

    static void print_arr(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }

        System.out.print(arr[idx] +" ");

        print_arr(arr,idx+1);

//        System.out.print(arr[idx] +" ");  print  reverse of array
    }

    public static void main(String[] args) {
        int []arr = {2,9,8,4,5};

        print_arr(arr,0);
    }
}
