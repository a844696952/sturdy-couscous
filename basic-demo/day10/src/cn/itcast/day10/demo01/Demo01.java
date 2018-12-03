package cn.itcast.day10.demo01;

public interface Demo01 {
    public abstract void method1();
    public abstract void method2();
    public abstract void method3();
    public default void def(){
        jing();
    }
    private static void jing(){
        System.out.println("gege");
    }
}
