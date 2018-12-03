package cn.itcast.day11.demo02;

/*提示用户控制台输入一个长度大于10的字符串(包含大小写字母,数字,其他符号)，完成以下要求：
⑴ 判断字符串长度，若用户输入的字符串长度小于10，则提示输入不合法，并结束程序；
⑵ 若字符串长度合法，统计字符串中字母的个数（大写字母和小写字母都算）, 统计数字的个
数(0-9)，统计除字母和数字外其他符号的个数,将统计出来的结果打印到控制台上*/


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入一个长度大于10的字符串");
        String str = sca.nextLine();
        char[] cs = str.toCharArray();
        int count=0,count1=0;
        if (cs.length<10){
            System.out.println("输入不合法");
        }else{
            for (int i = 0; i < cs.length; i++) {
                if ((cs[i]>='a'&&cs[i]<='z')||(cs[i]>='A'&&cs[i]<='Z')){
                    count++;
                }else if ((cs[i]>='0'&&cs[i]<='9')){
                    count1++;
                }
            }
            System.out.println("输入的字母个数为"+count);
            System.out.println("输入的数字个数为"+count1);
        }
    }
}
