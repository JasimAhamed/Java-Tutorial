import java.util.Scanner;
public class Num_1_to_100 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=0; i<=num; i++){
            System.out.print(i+" ");
        }
    }
}
