package cn.itcast.day09.finallytest_27;

import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {
        Phone one = new Phone("小米MIX2",2999.0,"新机皇");
        Phone two = new Phone("Iphone8", 5888.0,"火爆新机");
        Phone three = new Phone("VIVO X9s",1998.0,"火爆新机");
        ArrayList<Phone> list_phone=new ArrayList<>();
        list_phone.add(one);
        list_phone.add(two);
        list_phone.add(three);
        ArrayList<Phone> list=filter(list_phone,2000);
        System.out.println(list);
    }
    public static ArrayList<Phone> filter(ArrayList<Phone> list_phone, double price) {
        ArrayList<Phone> list=new ArrayList<>();

        for (int i = 0; i < list_phone.size(); i++) {
            if (list_phone.get(i).getPrice()>price){
                list.add(list_phone.get(i));
            }
        }
        return list;
    }
}
