package cn.itcast.day06.demo01;

public class Game {
    private String name ;
    private int age;
    public void show() {
        System.out.println("我叫："+name+", 年龄:"+age);
    }
    public void setAge(int age) {
        if (age>+0&&age<100){
        this.age = age;
        }else{
            System.out.println("数据错误");
        }
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}