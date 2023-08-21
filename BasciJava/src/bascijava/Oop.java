package bascijava;

public class Oop {
    String name;
    int age;
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
    Oop(String n,int a){
        name=n;
        age=a;
    }
    public static void main(String[] args) {
        Oop obj1=new Oop("bassam",25);
        obj1.display();
    }
}
