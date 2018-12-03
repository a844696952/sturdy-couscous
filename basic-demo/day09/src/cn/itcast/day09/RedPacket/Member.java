package cn.itcast.day09.RedPacket;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{

    public void shou(ArrayList<Integer> list){
        if (list.size()==0){
            return;
        }
        int num=new Random().nextInt(list.size());
        int left = list.get(num);
        setLeftMoney((getLeftMoney()+left));
        list.remove(num);
    }

    public Member(int leftMoney, String name) {
        super(leftMoney, name);
    }

    public Member() {
    }
}
