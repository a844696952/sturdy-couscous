package cn.itcast.day06.test;

public class Teacher {
    private String name;
    private int age;
    private String content;
    public void eat(){
        System.out.println(name+"今年"+age+"岁还在吃饭");
    }
    public void teach(){
        System.out.println(name+"今年"+age+"岁还在教学");
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Teacher(String name, int age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
    }

    public Teacher() {
    }
}
