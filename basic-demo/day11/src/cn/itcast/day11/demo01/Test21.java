package cn.itcast.day11.demo01;

/*编写一个Java程序，提示用户输入一串字符串，要求字符串中必须存在字母（需要代码判断）
1.若不符合要求，则提示用户重新输入直至符合要求为止
2.若符合要求，则判断字符串中大写字母出现次数并打印。*/

import java.util.Scanner;

public class Test21 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        char[] chars;
        boolean b=true;
        int count=0;
        do {
            System.out.println("请输入");
            String str = sca.nextLine();
            chars= str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if ((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z')) {
                    b=false;
                    break;
                }
            }
            if (b){
                System.out.println("输入错误");
            }
        } while (b);
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= 'A' && chars[i] <= 'Z')){count++;}
        }
        System.out.println(count);
    }
}
