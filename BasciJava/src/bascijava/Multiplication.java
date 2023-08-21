package bascijava;
import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num;
        System.out.printf("input number: ");
        num=input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
}
