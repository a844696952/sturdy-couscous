package cn.itcast.day12.demo03;

public class Stringbuild {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(new Student("杨永信",55)).append("掌控雷电");
        System.out.println(sb);
        String ss1=String.valueOf(new Student("小李",19));
        System.out.println(ss1);
        int s1=Integer.parseInt("1");
        double s2=Double.parseDouble("2.14");
        System.out.println(s1+s2);
        char[] chars={'中','国','红'};
        String ss2=String.valueOf(chars);
        System.out.println(ss2);
    }
}
