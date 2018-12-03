package cn.itcast.day06.demo04;

import java.util.ArrayList;

public class PersonText {
    public static void main(String[] args) {
        ArrayList<Person> list=new ArrayList<Person>();
        Person one=new Person("洪七公",18);
        Person two=new Person("欧阳锋",18);
        Person three=new Person("黄药师",18);
        Person four=new Person("段智兴",18);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        person(list);
    }
    public static void person(ArrayList<Person> list){
        for (int i = 0; i < list.size(); i++) {
            Person per=list.get(i);
            System.out.println(per.getAge()+per.getName());
        }
    }
}
