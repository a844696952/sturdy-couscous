package cn.itcast.day06.test;

public class Student {
    private String name;
    private int age;
    public void study(){
        System.out.println(name+"今年"+age+"岁还在学习");
    }

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

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }
}
