package bascijava;
abstract class Parent {
    abstract public void showName();
    
    public void showID(){
        System.out.println("ID is: 221311165");
    }
}
class Child extends Parent{
    public void showName(){
        System.out.println("Name is: Bassam");
    }
}
public class Abstruction {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.showName();
        obj.showID();
    }
}
