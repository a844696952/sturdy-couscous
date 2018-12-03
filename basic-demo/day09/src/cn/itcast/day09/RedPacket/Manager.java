package cn.itcast.day09.RedPacket;

import java.util.ArrayList;

public class Manager extends User{
    public ArrayList<Integer> seng(int count,int money){
        ArrayList<Integer> list=new ArrayList<>();
        if (money> getLeftMoney()){
            System.out.println("余额不足");
            return list;
        }
        for (int i = 0; i < count-1; i++) {
            list.add(money/count);
        }
        list.add(money/count+money%count);
        setLeftMoney((getLeftMoney()-money));
        return list;
    }

    public Manager(int leftMoney, String name) {
        super(leftMoney, name);
    }

    public Manager() {
    }
}
