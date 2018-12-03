package cn.itcast.day11.Teach;

/*④在main方法中，定义教师类、学生类并赋值
调用teaching()、getMyResult（）方法。*/

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("杨永信","电击疗法");
        Student student = new Student("小明",59,teacher);
        teacher.teaching();
        student.getMyResult();
    }
}
