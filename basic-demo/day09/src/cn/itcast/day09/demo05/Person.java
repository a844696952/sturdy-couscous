package cn.itcast.day09.demo05;

//姓名name、性别gender、年龄age、国籍nationality；
//        方法：吃饭eat、睡觉sleep，工作work。

public abstract class Person {
    private String name;
    private String nationality;
    private int age;
    public void eat(){}
    public void sleep(){}
    public abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String nationality, int age) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }

    public Person() {
    }
}
