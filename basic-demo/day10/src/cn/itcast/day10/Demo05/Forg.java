package cn.itcast.day10.Demo05;

public class Forg extends Animal implements Swim {
    @Override
    public void eat() {
        System.out.println("吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("蛙泳");
    }
}