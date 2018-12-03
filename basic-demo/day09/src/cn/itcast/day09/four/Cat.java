package cn.itcast.day09.four;

public class Cat extends Animal {
    @Override
    public void eat(String something) {
        System.out.println("猫吃" + something);
    }

    public void catchMouse() {
        System.out.println("逮老鼠");
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    public Cat() {
    }
}