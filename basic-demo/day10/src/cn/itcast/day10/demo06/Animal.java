package cn.itcast.day10.demo06;

public abstract class Animal {
    String name;
    public abstract void speak(String str);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }
}
