package cn.itcast.day09.RedPacket;

public class User {
    private int leftMoney;
    private String name;
    public void method(){
        System.out.println("我叫："+getName()+",我有"+ getLeftMoney()+"元钱");
    }

    public User(int leftMoney, String name) {
        this.leftMoney = leftMoney;
        this.name = name;
    }

    public User() {
    }

    public int getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(int leftMoney) {
        this.leftMoney = leftMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
