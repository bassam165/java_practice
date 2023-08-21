package bascijava;
public class ArrayDuplicate {
    public static void main(String[] args){
        int a1[] = new int[] {1,2,5,2,6};
        for(int i=0; i<a1.length; i++){
            System.out.println(a1[i]);
        }
        System.out.println();
        for(int i=0; i<a1.length; i++){
            for(int j=i+1; j<a1.length; j++){
                if(a1[i] == a1[j])
                    System.out.println(a1[i]);
            }
        }
    }
}
