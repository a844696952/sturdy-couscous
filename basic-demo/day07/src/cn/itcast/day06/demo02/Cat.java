package cn.itcast.day06.demo02;

public class Cat {
    private String breed;
    private String color;
    public void eat(){
        System.out.println(color+"的"+breed+"正在吃鱼.....");
    }
    public void catchMouse(){
        System.out.println(color+"的"+breed+"正在逮老鼠....");
    }

    public Cat(String breed, String color) {
        this.breed = breed;
        this.color = color;
    }

    public Cat() {
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
