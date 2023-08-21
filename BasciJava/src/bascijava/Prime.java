package bascijava;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
        int m,n;
        int count =0; 
        System.out.print("Enter initial number:");
        m = input.nextInt();
        System.out.print("Enter last number: ");
        n = input.nextInt();

        for(int i=m;i<=n;i++)
        {
            for(int j=2;j<i;j++)
            {        
              if(i%j==0)
              {
                count++;
                break;
              }
            } 
            if(count==0){
              System.out.println(i);             
            }
            count=0;          
        }
      }    
    }
}
