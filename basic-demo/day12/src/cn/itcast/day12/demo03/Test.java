package cn.itcast.day12.demo03;

public class Test {
    public static void main(String[] args) {
        Student 张三 = new Student(18, "张三");
        Student 李四 = new Student(18, "张三");
        System.out.println(张三.equals(李四));
        System.out.println(李四);
    }
}