package cn.itcast.day09.finallytest_27;

import java.util.Random;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入2-5之间的一个数字");
        int num=sca.nextInt();
        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=ran.nextInt(99)+1;
            if (arr[i]%num==0){
                System.out.println(arr[i]);
            }
        }
        System.out.print("这5个数是：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
