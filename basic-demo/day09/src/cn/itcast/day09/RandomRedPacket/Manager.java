package cn.itcast.day09.RandomRedPacket;

import java.util.ArrayList;
import java.util.Random;

public class Manager extends User{
    public ArrayList<Double> seng(int count, int money){
        Random ran = new Random();
        ArrayList<Double> list=new ArrayList<>();
        if (money> getLeftMoney()){
            System.out.println("余额不足");
            return list;
        }
        for (int i = 0; i < count-1; i++) {
            double q=ran.nextDouble()+ran.nextInt(money);
            list.add(1.1);
        }
        list.add((double)(money/count+money%count));
        setLeftMoney((getLeftMoney()-money));
        return list;
    }

    public Manager(double leftMoney, String name) {
        super(leftMoney, name);
    }

    public Manager() {
    }
}

