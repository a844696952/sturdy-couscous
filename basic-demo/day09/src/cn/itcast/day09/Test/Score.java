package cn.itcast.day09.Test;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr=new int[10];
        int min=100,max=0;
        double sum=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入分数：");
            arr[i]=scanner.nextInt();
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
            sum+=arr[i];
        }
        sum=sum-min-max;
        System.out.println(sum/8);
    }
}
