package cn.itcast.day12.demo03;

public class Time {
    public static void main(String[] args) {
        long t1=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println("HelloWorld");
        }
        long t2=System.currentTimeMillis();
        System.out.println(t2-t1);
    }
}