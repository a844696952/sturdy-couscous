package cn.itcast.day09.finallytest_27;

public class Two {
    public static void main(String[] args) {
        String[] arr={"itcast","itheima","baitdu","weixin","zhifubao"};
        String[] arr1 = filter(arr, "it");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
    public static String[] filter(String[] arr,String str){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains(str)){
                count++;
            }
        }
        String[] arr1=new String[count];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains(str)){
                arr1[j]=arr[i];
                j++;
            }
        }
        return arr1;
    }
}