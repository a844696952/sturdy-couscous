package cn.itcast.day10.Demo03;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
