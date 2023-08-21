package bascijava;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] number = {2,5,6,9,8};
        Arrays.sort(number);
        for(int i=0; i<5; i++)
        {
            System.out.print(number[i]);
        }
        System.out.println();
        for(int i=4; i>=0; i--)
        {
            System.out.print(number[i]);
        }
    }
}
