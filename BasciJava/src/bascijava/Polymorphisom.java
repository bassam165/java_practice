package bascijava;
class Shape{
    double area(){
        return 0;
    }
}
class rec extends Shape{

    double length,width;
    rec(double length,double width){
        this.length=length;
        this.width=width;
    }
    double area(){
        return length*width;
    }
}
public class Polymorphisom {
    public static void main(String[] args) {
        Shape s= new Shape();
        rec r =new rec(10,20);
        System.out.println(s.area());
        System.out.println(r.area());
    }
}
