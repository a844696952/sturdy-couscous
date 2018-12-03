package cn.itcast.day12.demo03;

import java.util.Objects;

public class Student {
    private int age;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "年龄" + age +"岁的" + name ;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public Student( String name,int age) {
        this.age = age;
        this.name = name;
    }

    public Student() {
    }
}
