package cn.itcast.day11.demo01;

import java.util.Scanner;

/*分析以下需求，并用代码实现：
提示用户控制台输入一个长度大于10的字符串(包含大小写字母,数字,其他符号)，完成以下要求：
⑴ 判断字符串长度，若用户输入的字符串长度小于10，则提示输入不合法，并结束程序；
⑵ 若字符串长度合法，统计字符串中字母的个数（大写字母和小写字母都算）, 统计数字的
个数(0-9)，统计除字母和数字外其他符号的个数,将统计出来的结果打印到控制台上*/
public class Test3 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入一个长度大于10的字符串");
        int count1=0,count2=0,count3=0;
        String str = sca.nextLine();
        char[] chars = str.toCharArray();
        if (chars.length>=10){
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
        }else{
            System.out.println("输入不合法");
        }
    }
}
