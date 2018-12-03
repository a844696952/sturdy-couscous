package cn.itcast.day12.demo03;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Arrays;

public class Fu {
    public static void main(String[] args) {
        int[] src={10,20,30,40,50,60,70};
        int[] dest=new int[7];
        System.arraycopy(src,1,dest,0,6);
        System.out.println(Arrays.toString(dest));
        Date date1 = new Date();
        System.out.println(date1);
        System.out.println(date1.getTime());
        Date date2 = new Date(1000l*60*60*24*365);
        System.out.println(date2.getTime());
        date2.setTime(1000l*60*60*24*365*2);
        System.out.println(date2.getTime());
        SimpleDateFormat yy= new SimpleDateFormat("yy年MM月dd日");
        Date date3 = new Date();
        String str = yy.format(date3);
        System.out.println(str);
    }
}
