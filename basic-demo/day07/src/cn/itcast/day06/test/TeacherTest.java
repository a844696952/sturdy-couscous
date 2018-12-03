package cn.itcast.day06.test;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher =new Teacher();
        teacher.setAge(66);
        teacher.setContent("雷电疗法");
        teacher.setName("杨永信");
        teacher.eat();
        teacher.teach();
        System.out.println("================");
        Teacher teacher1 =new Teacher("杨永信",66,"雷电疗法");
        teacher1.eat();
        teacher1.teach();
        System.out.println("================");
        School school=new School();
        school.setName("小明");
        school.setContent("被电击");
        school.setAge(6);
        school.eat();
        school.study();
        System.out.println("================");
        School school1=new School("小明","被电",6);
        school.eat();
        school.study();
    }
}