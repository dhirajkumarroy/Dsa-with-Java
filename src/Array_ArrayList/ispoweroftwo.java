package Array_ArrayList;

public class ispoweroftwo {

   static int maxind(int []arr){

       int max = arr[0];

       int index = 0;

       for(int i=0;i<arr.length;i++){
           if(arr[i]>max) {
               max = arr[i];
               index = i;
           }
       }

       return index;
   }

    public static void main(String[] args) {
        int arr[] ={3,5,1,6,2};

        System.out.println(maxind(arr));
    }
}
