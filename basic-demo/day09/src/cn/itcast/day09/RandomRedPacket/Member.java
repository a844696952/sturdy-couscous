package cn.itcast.day09.RandomRedPacket;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{

    public void shou(ArrayList<Double> list){
        if (list.size()==0){
            return;
        }
        int num=new Random().nextInt(list.size());
        double left = list.get(num);
        setLeftMoney((getLeftMoney()+left));
        list.remove(num);
    }

    public Member(double leftMoney, String name) {
        super(leftMoney, name);
    }

    public Member() {
    }
}