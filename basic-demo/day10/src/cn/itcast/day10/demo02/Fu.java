package cn.itcast.day10.demo02;

public interface Fu {
        public default void method() {
            System.out.println("父类方法执行啦");
        }
        default void methodFu() {
            System.out.println("父类特有方法");
        }
}
