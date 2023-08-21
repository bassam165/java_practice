package bascijava;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
       int n,fact=1;
       Scanner input = new Scanner(System.in);
       System.out.println("Eneter number: ");
       n=input.nextInt();
        for(int i = n; i >= 1; i--) {
            fact=fact*i;
        }
        System.out.printf("factorial is: %d\n",fact);
    }
 
}
