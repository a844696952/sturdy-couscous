package cn.itcast.day06.demo02;

import cn.itcast.day06.demo02.Phone;

public class PhoneTeat01 {
    public static void main(String[] args) {
        Phone ph=new Phone();
        ph.setBrand("小米");
        ph.setPrice(999);
        ph.call();
        ph.send();
        ph.playGame();
        System.out.println("===============");
        Phone pho=new Phone("苹果",5299);
        pho.call();
        pho.send();
        pho.playGame();
    }
}
