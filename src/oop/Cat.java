package oop;

public class Cat {
    public  String cName;
    public Cat(String cName){
        this.cName=cName;
    }
    public static void main(String[] args) {
        Cat muCat=new Cat("luna");
        System.out.println(muCat.cName);
    }
}
