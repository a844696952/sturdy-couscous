package cn.itcast.day09.demo05;

/*
增加属性：
        职务job；
        增加方法：开会meeting。
*/

public class StudentLeader extends Student{
    private String job;

    public void meeting(){
        System.out.println("学生干部喜欢开会!");
    }
    @Override
    public void work() {
        meeting();
    }
}
