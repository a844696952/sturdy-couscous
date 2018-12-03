package cn.itcast.day10.demo01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Final_Test {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone one=new Phone("小米MIX2",2999,"新机皇");
        Phone two=new Phone("Iphone8", 5888,"火爆新机");
        Phone three=new Phone("VIVO X9s",1998,"火爆新机");
        list.add(one);
        list.add(two);
        list.add(three);
        ArrayList<Phone> list1 = filter(list, 2000);
        System.out.println(list1);
    }
    public static ArrayList<Phone> filter(ArrayList<Phone> list,double price) {
        ArrayList<Phone> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice()>price){
                list1.add(list.get(i));
            }
        }
        return list1;
    }
}
