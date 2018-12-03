package cn.itcast.day06.test;

public class StudentTest {
    public static void main(String[] args) {
        Student student =new Student();
        student.setAge(80);
        student.setName("赵四");
        student.study();
        System.out.println("===========");
        Student student1 =new Student("赵四",80);
        student1.study();
    }
}
