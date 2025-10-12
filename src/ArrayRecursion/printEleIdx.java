package ArrayRecursion;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.spi.AbstractResourceBundleProvider;

public class printEleIdx {

    static ArrayList<Integer> find_arr_idx(int []arr,int idx,int k){

        ArrayList<Integer> ans = new ArrayList<>();

        if(idx == arr.length){
            return  ans; // return empty array list
        }

        if(arr[idx] == k){
            ans.add(idx);
        }

        ArrayList<Integer> smallans = find_arr_idx(arr,idx+1,k);

        ans.addAll(smallans);

        return ans;
    }
    static void print_ele_idx(int []arr,int idx,int v){

       if(idx == arr.length){
           return;
       }

        if(arr[idx] == v){
            System.out.print(idx+" ");
        }

        print_ele_idx(arr,idx+1,v);
    }

    public static void main(String[] args) {
        int []arr = {1,2,4,2,6,2,2};
        int k = 2;
        System.out.print("Idx of ele "+k  +":- ");
        print_ele_idx(arr,0,k);

        System.out.println();
        ArrayList<Integer> ans = find_arr_idx(arr,0,k);
        System.out.print("Idx of ele "+k  +":- ");
        for(Integer n: ans ){
            System.out.print(n+" ");
        }
    }
}
