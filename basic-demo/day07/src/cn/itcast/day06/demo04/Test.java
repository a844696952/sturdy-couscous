package cn.itcast.day06.demo04;

import java.util.Random;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Random num=new Random();
        ArrayList<Integer> list=new ArrayList();
        for (int i = 0; i < 10; i++) {
             list.add(num.nextInt(100));
        }
        System.out.println(list);
        System.out.println(oushu(list));;
    }
    public static ArrayList<Integer> oushu(ArrayList<Integer> list){
        ArrayList<Integer> list1=new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2==0){
                list1.add(list.get(i));
            }
        }return list1;
    }
}
