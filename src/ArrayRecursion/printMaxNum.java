package ArrayRecursion;

public class printMaxNum {

    static int find_Max(int []arr,int idx){ // find max using recursion

        if(idx == arr.length-1){
            return arr[idx];
        }

//        int smallans = find_Max(arr,idx+1);

//        return Math.max(smallans,arr[idx]);

        return Math.max(find_Max(arr,idx+1),arr[idx]);
    }

    static int findMax(int[] arr){

        int max = arr[0];
        for(int n : arr){

//            max = Math.max(n,max);
            if(n>max){
                max = n;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int [] arr = {3,9,15,4,9,10};

//        System.out.println("Max Num in Array: "+findMax(arr));

        System.out.println("Max Num in Array: "+find_Max(arr,0));

    }
}
