package bascijava;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n,first=0,second=1,fibo;
        System.out.print("enter number: ");
        n=input.nextInt();
        System.out.print(first+" "+second);
        for(int i=3; i<=n; i++)
        {
            fibo=first+second;
            System.out.print(" "+fibo);
            first=second;
            second=fibo;
        }
    }
}
