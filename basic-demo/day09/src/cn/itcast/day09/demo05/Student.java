package cn.itcast.day09.demo05;

//学校school、学号stuNumber；
//        重写工作方法（学生的工作是学习）。

public class Student extends Person{
    private String school;
    private int stuNumber;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(int stuNumber) {
        this.stuNumber = stuNumber;
    }

    public Student(String name, String nationality, int age, String school, int stuNumber) {
        super(name, nationality, age);
        this.school = school;
        this.stuNumber = stuNumber;
    }

    public Student(String school, int stuNumber) {
        this.school = school;
        this.stuNumber = stuNumber;
    }

    public Student(String name, String nationality, int age) {
        super(name, nationality, age);
    }

    public Student() {
    }

    @Override
    public void work() {
        System.out.println("学生的工作是学习");
    }
}
