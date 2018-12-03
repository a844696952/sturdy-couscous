package cn.itcast.day06.demo04;

import java.util.Random;
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Random ran=new Random();
        Scanner sc=new Scanner(System.in);
        int num=ran.nextInt(100)+1;
        System.out.println("请输入");
        for (int i = 0; true; i++) {
            int j = sc.nextInt();
            if (j>num){
                System.out.println("太大了，请重新输入");
            }else if (j<num){
                System.out.println("太小了，请重新输入");
            }else if (j==num){
                System.out.println("恭喜你猜中了！");
                break;
            }
        }
        System.out.println("游戏结束");
    }
}
