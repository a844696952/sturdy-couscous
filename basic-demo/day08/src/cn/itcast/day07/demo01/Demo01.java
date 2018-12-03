package cn.itcast.day07.demo01;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        System.out.println("请输入：");
        String s = string.nextLine();
        int countA = 0, counta = 0, count1 = 0, counto = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ('a' <= chars[i] && 'z' >= chars[i]) {
                counta++;
            } else if ('A' <= chars[i] && 'Z' >= chars[i]) {
                countA++;
            } else if ('1' <= chars[i] && chars[i] <= '9') {
                count1++;
            } else {
                counto++;
            }
        }
        System.out.println("大写字母："+countA);
        System.out.println("小写字母"+counta);
        System.out.println("数字："+count1);
        System.out.println("其他："+counto);
    }
}