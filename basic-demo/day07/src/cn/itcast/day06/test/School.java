package cn.itcast.day06.test;

public class School {
    private String name;
    private String content;
    private int age;
    public void eat(){
        System.out.println(name+"今年"+age+"岁还在吃饭");
    }
    public void study(){
        System.out.println(name+"今年"+age+"岁还在学习");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public School(String name, String content, int age) {
        this.name = name;
        this.content = content;
        this.age = age;
    }

    public School() {
    }
}
