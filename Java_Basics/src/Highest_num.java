//ip = 9876
//op = 9
import java.util.Scanner;
public class Highest_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int digit = 0;
        int op = 0;
        while(temp>0){
            digit = temp % 10;
            if(digit>op){
                op = digit;
            }
            temp = temp/10;
        }
        System.out.println(op);
    }
}
