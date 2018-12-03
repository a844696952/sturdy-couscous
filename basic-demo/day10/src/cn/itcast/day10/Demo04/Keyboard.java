package cn.itcast.day10.Demo04;

public class Keyboard implements Usb {
    public void keyboardShu(){
        System.out.println("键盘输入");
    }
    @Override
    public void open() {
        System.out.println("打开键盘");
    }
    @Override
    public void close() {
        System.out.println("关闭键盘");
    }
}
