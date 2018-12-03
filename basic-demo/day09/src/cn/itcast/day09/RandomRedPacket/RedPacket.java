package cn.itcast.day09.RandomRedPacket;

import java.util.ArrayList;

public class RedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager(100.0,"群主");
        Member one = new Member(0,"A");
        Member two = new Member(0,"B");
        Member three = new Member(0,"C");
        manager.method();
        one.method();
        two.method();
        three.method();
        System.out.println("===================");
        ArrayList<Double> list = manager.seng(3, 100);
        one.shou(list);
        two.shou(list);
        three.shou(list);
        manager.method();
        one.method();
        two.method();
        three.method();
    }
}