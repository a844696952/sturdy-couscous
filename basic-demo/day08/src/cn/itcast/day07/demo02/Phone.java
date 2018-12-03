package cn.itcast.day07.demo02;
/*1.手机类Phone
属性:品牌brand,价格price
无参构造,有参构造
行为:打电话call,发短信sendMessage,玩游戏playGame
2.测试类
创建Phone类对象,调用Phone类中的方法
思考:假设所有的手机都有属性屏幕的尺寸(int size),而且假设所有手机的屏幕尺寸为6,应该如何实现?*/
public class Phone {
    private String brand;
    private double price;
    static int size;
    public void call(){
    }
    public void sendMessage(){
    }
    public void playGame(){
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getSize() {
        return size;
    }

    public static void setSize(int size) {
        Phone.size = size;
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public Phone() {
    }
}
