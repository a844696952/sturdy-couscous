package cn.itcast.day10.Demo04;

public class Mouse implements Usb {
    public void mouseDian(){
        System.out.println("点击鼠标");
    }
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }
    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }
}
