package cn.itcast.day06.test;

public class Car {
    private String color;
    private int wheel;
    public void run(){
        System.out.println("pao");
    }
    public void listenRadio(){
        System.out.println("ting");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public Car(String color, int wheel) {
        this.color = color;
        this.wheel = wheel;
    }

    public Car() {
    }
}
