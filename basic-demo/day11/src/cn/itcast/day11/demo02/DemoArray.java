package cn.itcast.day11.demo02;

import java.util.ArrayList;
import java.util.List;

public class DemoArray {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        List<String> lis = method(list);
        for (int i = 0; i < lis.size(); i++) {
            System.out.println(lis.get(i));
        }
    }
    public static ArrayList<String> method(List<String> list){
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马尔扎哈");
        list.add("沙扬娜拉");
        return (ArrayList<String>)list;
    }
}
