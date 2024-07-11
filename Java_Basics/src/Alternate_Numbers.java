import java.util.Scanner;
public class Alternate_Numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<=num; i+=2){
            System.out.print(i+" ");
        }
    }
}
