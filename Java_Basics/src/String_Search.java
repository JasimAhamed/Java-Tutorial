import java.util.*;
public class String_Search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        String word = sc.nextLine();
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextLine();
        }
        for(int i=0; i<arr.length; i++){
            if (arr[i]==word){
                System.out.println("Found the word in index "+i);
                break;
            }
            else{
                System.out.println("-1");
            }
        }
    }
}
