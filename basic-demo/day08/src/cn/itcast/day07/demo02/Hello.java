package cn.itcast.day07.demo02;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        System.out.println("请输入一个长的字符串：");
        String str = san.nextLine();
        System.out.println("请输入一个短的字符串：");
        String str1 = san.nextLine();
        int count=0;
        int i=0;
        do {
            i = str.indexOf(str1,i);
            count++;
            i++;
        }
        while( i <str.length()&&i!=0);
        count--;
        System.out.println(count);
    }
}