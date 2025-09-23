package Array_ArrayList;


import java.util.Arrays;

public class sortArray {
    public static int[] Sortarr(int []arr){

        int [] arr1;
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i]*arr[i];
        }

        Arrays.sort(arr);

        return arr;
    }

    public static void main(String[] args) {

        int []arr = {2,8,3,4};

        Sortarr(arr);
        for(int num:arr){
            System.out.println(num);
        }

    }
}
