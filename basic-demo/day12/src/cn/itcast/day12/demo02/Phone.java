package cn.itcast.day12.demo02;

/*d.定义手机类Phone,实现RedRay接口，要求：
1)重写controlTV方法：
 方法内输出"手机开启红外功能,控制电视"；
提示用户键盘录入电视节目信息并接受；
调用电视play方法,将节目信息作为参数传入；*/

import java.util.Scanner;

public class Phone implements RedRay{

    @Override
    public void controlTV(TV tv) {
        System.out.println("手机开启红外功能,控制电视");
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入节目名称：");
        String str = sca.nextLine();
        tv.play(str);
    }
}
