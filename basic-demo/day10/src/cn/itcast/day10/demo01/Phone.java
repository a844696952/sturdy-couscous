package cn.itcast.day10.demo01;

public class Phone {
    private String name;
    private double price;
    private String type;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Phone(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public Phone() {
    }
}
