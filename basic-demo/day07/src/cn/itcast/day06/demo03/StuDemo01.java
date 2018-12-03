package cn.itcast.day06.demo03;

public class StuDemo01 {
    public static void main(String[] args) {
        Student stu=new Student();
        Student stu1=new Student("鹿晗",28,false);
        System.out.print("姓名："+stu1.getName());
        System.out.print("年龄："+stu1.getAge());
        System.out.println("是不是爷们："+stu1.isMale());
        System.out.println("=============");
        stu1.setAge(18);
        stu1.setMale(false);
        stu1.setName("赵丽颖");
        System.out.print("姓名："+stu1.getName());
        System.out.print("年龄："+stu1.getAge());
        System.out.println("是不是爷们："+stu1.isMale());
    }
}
