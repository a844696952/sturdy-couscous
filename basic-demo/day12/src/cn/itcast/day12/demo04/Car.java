package cn.itcast.day12.demo04;

public class Car {
    private String ID;
    private String color;
    private String brand;
    private long time;

    @Override
    public String toString() {
        return ID + "-" + color + "-" + brand;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public Car( String brand, String color,String ID, long time) {
        this.ID = ID;
        this.color = color;
        this.brand = brand;
        this.time = time;
    }

    public Car() {
    }
}
