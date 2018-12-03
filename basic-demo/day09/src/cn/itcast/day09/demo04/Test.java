package cn.itcast.day09.demo04;

public class Test {
    public static void main(String[] args) {
        Golden golden = new Golden();
        Ha ha = new Ha();
        ha.sleep();
        ha.eat();
        System.out.println("==============");
        golden.sleep();
        golden.eat();
    }
}