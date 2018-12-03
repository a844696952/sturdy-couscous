package cn.itcast.day06.test;
/*1、定义一个汽车类Car。汽车有颜色 String color,有轮子 int wheel。
能在路上跑run(),能收听广播 listenRadio(),有有参构造,有无参构造,成
员变量私有,有get,set方法。在测试类中分别使用无参构造和有参构造创建
汽车对象并赋值，然后输出颜色和轮子，调用跑和收听广播的方法。*/


public class CarTest {
    public static void main(String[] args) {
        Car car=new Car();
        car.setColor("黑色");
        car.setWheel(4);
        System.out.println(car.getColor()+"车子"+car.getWheel()+"个轮子");
        car.run();
        car.listenRadio();
        Car car1=new Car("黑色",4);
        System.out.println(car1.getColor()+"车子"+car1.getWheel()+"个轮子");
        car1.run();
        car1.listenRadio();
    }
}
