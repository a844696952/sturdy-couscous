package cn.itcast.day12.demo03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) throws ParseException {
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入您的生日（96-10-03）：");
        String str = sca.nextLine();
        SimpleDateFormat sim = new SimpleDateFormat("yy-MM-dd");
        Date birth = sim.parse(str);
        long p=birth.getTime();
        long p1=System.currentTimeMillis();
        long d=(p1-p)/1000/3600/24;
        System.out.println(d);
    }
}
