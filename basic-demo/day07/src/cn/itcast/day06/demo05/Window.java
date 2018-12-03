package cn.itcast.day06.demo05;

public class Window {
    private String brand;
    private double price;
    private int year;

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Window(String brand, double price, int year) {
        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    public Window() {
    }
}
