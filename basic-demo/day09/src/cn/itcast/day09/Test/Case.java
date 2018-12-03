package cn.itcast.day09.Test;

/*取出字符串中索引3-9位置上的字符（包含3和9），统计 截取后新
 的字符串中字母的个数（大写字母和小写字母都算），将统计出来的结果打印到控制台上*/

import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入一个长度大于等于10的字符串：");
        String str = sca.nextLine();
        char[] cha = str.toCharArray();
        System.out.println("字符串总长度是：" + cha.length);
        int count = 0;
        if (cha.length < 10) {
            System.out.println("输入不合法");
        } else {
            System.out.print("截取后为：");
            for (int i = 0; i < cha.length; i++) {
                if (i >= 3 && i < 10) {
                    System.out.print(cha[i]);
                    if ((int) cha[i] > 64 && (int) cha[i] < 91) {
                        count++;
                    } else if ((int) cha[i] > 96 && (int) cha[i] < 123) {
                        count++;
                    }
                }
            }
            System.out.println();
            System.out.println("一个有" + count + "个字母");
        }
    }
}
