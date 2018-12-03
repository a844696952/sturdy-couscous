package cn.itcast.day12.demo04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        Scanner sca = new Scanner(System.in);
        SimpleDateFormat c=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("请输入车辆品牌：");
        String brand = sca.nextLine();
        System.out.println("请输入车辆颜色：");
        String color = sca.nextLine();
        System.out.println("请输入车牌号：");
        String ID = sca.nextLine();
        System.out.println("请输入停车时间：");//2018/08/29 08:18:00
        String time = sca.nextLine();
        Date start = c.parse(time);
        Car car = new Car(brand,color,ID,start.getTime());
        long end = System.currentTimeMillis();
        long a=(end-start.getTime())/1000/3600;
        System.out.println(car);
        System.out.println("入场时间"+time+" 一共停了"+a+"小时，收费"+(a*3)+"元");
    }
}
