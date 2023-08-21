package bascijava;
public class overload {
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(double a, double b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        overload ob = new overload();
        ob.add(10, 15);
        ob.add(10.2, 15.3);
    }
}
