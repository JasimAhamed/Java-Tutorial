//ip = 4
//op = *
//     22
//     ***
//     4444
import java.util.Scanner;
public class Pattern_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<n+1; i++){
            if(i%2==1){
                for(int j=1; j<i+1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                for(int j=1; j<i+1; j++){
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}
