import java.util.Scanner;
public class Alternate_Numbers_100_to_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=num; i>=0; i=i-3){
            System.out.print(i+" ");
        }
    }
}
