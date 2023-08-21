package bascijava;
import java.util.Scanner;
public class ArrayMax {
   public static void main(String[] args) {
        double [] number = new double[5];
        Scanner input = new Scanner(System.in);
        System.out.print("enter 5 number: ");
        for(int i=0; i<number.length; i++)
        {
            number[i]=input.nextDouble();
        }
        double max=number[0];
        for(int i=1; i<number.length; i++)
        {
            if(max<number[i])
                max=number[i];
        }
        System.out.println("max is: "+max);
}
}