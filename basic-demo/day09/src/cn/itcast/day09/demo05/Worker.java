package cn.itcast.day09.demo05;

/*增加属性：
        单位unit、工龄workAge；
        重写工作方法（工人的工作是盖房子）。*/

import java.util.PrimitiveIterator;

public class Worker extends Person{
    private String unit;
    private int workAge;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    public Worker(String name, String nationality, int age, String unit, int workAge) {
        super(name, nationality, age);
        this.unit = unit;
        this.workAge = workAge;
    }

    public Worker(String unit, int workAge) {
        this.unit = unit;
        this.workAge = workAge;
    }

    public Worker(String name, String nationality, int age) {
        super(name, nationality, age);
    }

    public Worker() {
    }

    @Override
    public void work() {
        System.out.println("工人的工作是盖房子");
    }
}
