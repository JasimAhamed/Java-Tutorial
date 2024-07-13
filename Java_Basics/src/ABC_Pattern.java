 import java.util.*;
class ABC_Pattern
{
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        int x=s1.nextInt();
        int l=97;
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)l);
            }
            System.out.println();
            l++;
        }
    }
}