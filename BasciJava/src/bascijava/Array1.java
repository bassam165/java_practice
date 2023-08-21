package bascijava;
import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        double [] number = new double[5];
        double sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("enter 5 number: ");
        for(int i=0; i<number.length; i++)
        {
            number[i]=input.nextDouble();
        }
        for(int i=0; i<number.length; i++)
        {
            sum=sum+number[i];
        }
        System.out.println("sum is: "+sum);
        System.out.println("sum is: "+sum/number.length);
    }
}
