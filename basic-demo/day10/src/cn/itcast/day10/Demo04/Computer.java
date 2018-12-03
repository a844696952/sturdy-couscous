package cn.itcast.day10.Demo04;

public class Computer {
    public void powerOn(){
        System.out.println("开机");
    }
    public void powerOff(){
        System.out.println("关机");
    }
    public  static void yong(Usb usb){
        if (usb instanceof Mouse){
            Mouse mouse=(Mouse) usb;
            mouse.mouseDian();
        }else if (usb instanceof Keyboard){
            Keyboard keyboard=(Keyboard)usb;
            keyboard.keyboardShu();
        }
    }
}
