package cn.itcast.day09.three;

public class Manager extends Person{
    private int bonus;

    @Override
    public void work() {
        System.out.println("让程序员写代码");
    }
}
