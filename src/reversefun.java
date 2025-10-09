public class reversefun {

    static int [] reverse(int []arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};

        int arr3[] = reverse(arr);
        for(int num : arr3){
            System.out.println(num+" ");
        }
    }

}
