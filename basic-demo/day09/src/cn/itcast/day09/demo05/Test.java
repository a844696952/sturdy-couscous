package cn.itcast.day09.demo05;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Worker worker = new Worker();
        StudentLeader studentLeader = new StudentLeader();
        student.work();
        worker.work();
        studentLeader.work();
    }
}
