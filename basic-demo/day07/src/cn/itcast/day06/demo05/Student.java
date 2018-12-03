package cn.itcast.day06.demo05;

public class Student {
    private String name;
    private int age;
    private String xue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getXue() {
        return xue;
    }

    public void setXue(String xue) {
        this.xue = xue;
    }

    public Student(String name, int age, String xue) {
        this.name = name;
        this.age = age;
        this.xue = xue;
    }

    public Student() {
    }
}
