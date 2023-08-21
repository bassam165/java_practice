package bascijava;

public class Person {
    String name;
    int age;
    public void set(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String get(){
        return name;
    }
    public int getA(){
        return age;
    }
    public static void main(String[] args) {
        Person p1=new Person();
        p1.set("ami", 10);
        System.out.println(p1.get());
        System.out.println(p1.getA());
    }
}
