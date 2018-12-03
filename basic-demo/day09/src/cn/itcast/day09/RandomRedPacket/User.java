package cn.itcast.day09.RandomRedPacket;

public class User {
    private double leftMoney;
    private String name;
    public void method(){
        System.out.println("我叫："+getName()+",我有"+ getLeftMoney()+"元钱");
    }

    public User(double leftMoney, String name) {
        this.leftMoney = leftMoney;
        this.name = name;
    }

    public User() {
    }

    public double getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(double leftMoney) {
        this.leftMoney = leftMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
