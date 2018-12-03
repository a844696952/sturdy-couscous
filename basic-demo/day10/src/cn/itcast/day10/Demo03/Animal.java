package cn.itcast.day10.Demo03;

public abstract class Animal {
    public abstract void eat();
    public static void havePet(Animal ani){
        if (ani instanceof Cat){
            ((Cat) ani).catchMouse();
        }else if (ani instanceof Dog){
            ((Dog) ani).watchHouse();
        }
    }
}