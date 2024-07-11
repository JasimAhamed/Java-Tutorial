import java.util.*;
public class Reverse_number_in_array {
    public static void main(String[] args){
        int[] arr = {21,35,59,74,92};
        for(int i=0; i< arr.length; i++){
            int temp = arr[i];
            int reversed = 0;
            while(temp>0){
                int dig = temp % 10;
                reversed = reversed * 10 + dig;
                temp = temp/10;
            }
            arr[i] = reversed;
        }
        System.out.println(Arrays.toString(arr));
    }
}
