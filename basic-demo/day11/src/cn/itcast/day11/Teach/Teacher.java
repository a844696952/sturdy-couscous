package cn.itcast.day11.Teach;

/*②定义类Teacher，实现接口Teach，包含空参构造，满参构造和以下成员变量
        姓名 name（String 类型）
        学科 course（String类型）
        实现  抽象方法teaching()，并输出"我是XX老师，我教YY学科”
        XX表示姓名，YY表示学科*/

public class Teacher implements Teach{
    String name;
    String course;

    @Override
    public void teaching() {
        System.out.println("我是"+this.name+"老师，我教"+this.course+"学科");
    }

    public Teacher(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public Teacher() {
    }
}
