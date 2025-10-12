package ArrayRecursion;

public class checkTargetValue {

    // return target element index
    static int return_index_of_ele(int[] arr, int idx, int v){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == v){
            return idx;
        }

        return return_index_of_ele(arr,idx+1,v);
    }
    static boolean check_target_value(int []arr, int idx,int v){

        if(idx == arr.length){
            return false;
        }

        if(arr[idx] == v){
            return true;
        }

       return check_target_value(arr,idx+1,v);
    }
    
    public static void main(String[] args) {
        int [] arr = {10,93,8,4,80,100};
        int k = 100;

        System.out.println("Element present or not in array: "+check_target_value(arr,0,10 ));

        System.out.println("Index of element: "+return_index_of_ele(arr,0,k));
        
    }
}
