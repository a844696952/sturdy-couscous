package cn.itcast.day10.demo01;

public interface Interface {
    static void method(){
        System.out.println();
        System.out.println("静态方法执行啦！");

    }
    public default void def(){
        jing();
    }

    private static void jing(){
        System.out.print("jing");
    }
}
