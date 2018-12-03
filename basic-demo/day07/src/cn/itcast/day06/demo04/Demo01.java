package cn.itcast.day06.demo04;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数");
        int a=sc.nextInt();
        System.out.println("输入第二个数");
        int b=sc.nextInt();
        System.out.println("输入第三个数");
        int c=sc.nextInt();
        System.out.println("最大数是："+((a>b?a:b)>c?a>b?a:b:c));

    }
}
