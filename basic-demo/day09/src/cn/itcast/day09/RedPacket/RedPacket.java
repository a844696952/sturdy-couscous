package cn.itcast.day09.RedPacket;

import java.util.ArrayList;

public class RedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager(100,"群主");
        Member one = new Member(0,"A");
        Member two = new Member(0,"B");
        Member three = new Member(0,"C");
        manager.method();
        one.method();
        two.method();
        three.method();
        System.out.println("===================");
        ArrayList<Integer> list = manager.seng(3, 10);
        one.shou(list);
        two.shou(list);
        three.shou(list);
        manager.method();
        one.method();
        two.method();
        three.method();
    }
}