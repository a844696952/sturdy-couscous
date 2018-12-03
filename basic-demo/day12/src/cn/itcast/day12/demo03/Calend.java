package cn.itcast.day12.demo03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calend {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        c.add(2,-12);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date1 = new Date();
        System.out.println(sdf.format(date1.getTime()));
        int year=c.get(Calendar.YEAR);
        int month=c.get(2)+1;
        int day=c.get(Calendar.DAY_OF_MONTH);
        int index=c.get(Calendar.DAY_OF_WEEK);
        System.out.print(year+"年"+month+"月"+day+"日  ");
        String[] weeks={"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        System.out.print(weeks[index]);
    }
}
