import java.util.*;
public class Third_largest_in_Array {
    public static void main(String[] args){
        int arr[] = {35,56,89,26,98,76};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Third largest element : "+arr[arr.length - 3]);
        System.out.print("Index : "+(arr.length-3));

    }
}
