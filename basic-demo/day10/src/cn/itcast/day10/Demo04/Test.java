package cn.itcast.day10.Demo04;

import java.security.Key;

public class Test {
    public static void main(String[] args) {
        Computer com = new Computer();
        com.powerOn();
        Usb usbMouse= new Mouse();
        usbMouse.open();
        Mouse mouse=(Mouse) usbMouse;
        com.yong(mouse);
        usbMouse.close();
        System.out.println("=================");
        Keyboard keyboard = new Keyboard();
        keyboard.open();
        com.yong(keyboard);
        Usb usbKeyboard=keyboard;
        usbKeyboard.close();
        com.powerOff();
    }
}
