package Searching;

public class RecursiveBinarySearch {
    int binarySearch(int []arr, int low,int high,int key){
        while(low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid]==key){
                return mid;
            }

            if(arr[mid]>key){
                return binarySearch(arr,low,mid-1,key);
            }
            else{
                return binarySearch(arr,mid+1,high,key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr = {12,19,20,30,40};
        int len = arr.length;
        int key =12;

        RecursiveBinarySearch obj = new RecursiveBinarySearch();

        int result = obj.binarySearch(arr,0,len-1,key);

        System.out.print("Index: "+result);
    }
}
