package cn.itcast.day06.demo05;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student one=new Student("小红",12,"小学");
        Student two=new Student("小米",21,"大学");
        Student three=new Student("小明",14,"初中");
        ArrayList<Student> list=new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge()<15){
                list.get(i).setXue("幼儿园");
            }
            System.out.println(list.get(i).getName()+"-"+list.get(i).getAge()+"-"+list.get(i).getXue());
        }

    }
}
