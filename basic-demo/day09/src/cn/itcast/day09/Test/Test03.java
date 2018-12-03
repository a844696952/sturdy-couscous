package cn.itcast.day09.Test;

import java.util.ArrayList;

/*  ⑴ 创建一个学生类，包含两个私有属性：姓名（name）和成绩（score）（name的类
    型为String类型，score的类型为int类型），并提供无参和有参构造，get/set方法；
    ⑵ 创建一个ArrayList集合为list，并添加3个学生对象到list集合中，分别为：
    姓名 成绩
    张三  99
    李四  66
    王五  77
    ⑶ 遍历集合，将list集合中成绩小于70的学生打印出来
    ⑷ 在控制台上打印list集合中成绩大于70的学生的分数平均值*/
public class Test03 {
    public static void main(String[] args) {
        Student one= new Student("张三",99);
        Student two= new Student("李四",66);
        Student three= new Student("王五",77);
        ArrayList<Student> list=new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        double sum =0;
        int count=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getScore()<70){
                System.out.println(list.get(i).getName());
            }else if (list.get(i).getScore()>70){
                sum +=list.get(i).getScore();
                count++;
            }
        }
        System.out.println(sum /count);
    }
}
