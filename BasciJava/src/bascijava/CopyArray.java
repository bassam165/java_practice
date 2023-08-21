package bascijava;
import java.util.Scanner;
public class CopyArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many nunber want to input: ");
        int n=input.nextInt();
        int[] a1 = new int[10];
        int[] a2 = new int [a1.length];
        for(int i=0; i<n; i++){
            a1[i] = input.nextInt();
        }
        System.out.println();
        for(int i=0; i<n; i++){
            System.out.println(a1[i]);
        }
        for(int i=0; i<a1.length; i++){
            a2[i] = a1[i];
        }
        System.out.println("copy array");
        for(int i=0; i<n; i++){
            System.out.println(a2[i]);
        }
    }
}
