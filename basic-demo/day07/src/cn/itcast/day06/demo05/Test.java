package cn.itcast.day06.demo05;

/*1.定义一个集合 ArrayList,用于保存随机数数据,只保存 10个随机数.
2.产生随机数,要求范围是三位数.包括100不包括1000
3.判断当前的数据当中是否存在 3的倍数,如果出现3的倍数就删除改元素.
4.循环遍历,最后剩余的元素数据*/

import java.util.Random;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Random num=new Random();
        for (int i = 0; i < 10; i++) {
            list.add(num.nextInt(900)+100);
        }
        System.out.println(list);
        System.out.println(max(list));
    }
    public static ArrayList<Integer> max(ArrayList<Integer> list){
        ArrayList<Integer> list1=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%3!=0){
                list1.add(list.get(i));
            }else{
                continue;
            }
        }
        return  list1;
    }
}
