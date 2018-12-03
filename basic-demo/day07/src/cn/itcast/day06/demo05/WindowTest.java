package cn.itcast.day06.demo05;

import java.util.ArrayList;

public class WindowTest {
    public static void main(String[] args) {
        ArrayList<Window> list=new ArrayList();
        Window one=new Window("华为",1200,4);
        Window two=new Window("苹果",9000,1);
        Window three=new Window("锤子",3000,3);
        Window four=new Window("小米",1800,2);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice()<2000&&list.get(i).getYear()<=2){
                System.out.println(list.get(i).getBrand()+"-"+list.get(i).getPrice()+"-"+list.get(i).getYear());
            }else if (list.get(i).getPrice()>5000){
                list.remove( i);
                i--;
            }
        }
        System.out.println(list);
    }
}
