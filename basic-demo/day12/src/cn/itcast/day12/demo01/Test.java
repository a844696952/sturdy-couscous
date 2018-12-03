package cn.itcast.day12.demo01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入一串字符串（不能包含空格）：");
        int count1=0,count2=0,count3=0;
        String str = sca.next();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i]>='a'&&chars[i]<='z')||(chars[i]>='A'&&chars[i]<='Z')){
                count1++;
            }else if (chars[i]>='0'&&chars[i]<='9'){
                count2++;
            }else {
                count3++;
            }
        }
        System.out.println("英文字母个数为"+count1);
        System.out.println("数字个数为"+count2);
        System.out.println("其他符号个数为"+count3);
    }
}
