package cn.itcast.day09.four;

public class Dog extends Animal {
    @Override
    public void eat(String something) {
        System.out.println("狗吃"+something );
    }
    public void lookHome() {
        System.out.println("看家");
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    public Dog() {
    }
}
