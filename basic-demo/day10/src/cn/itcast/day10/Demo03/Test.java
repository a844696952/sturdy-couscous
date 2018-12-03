package cn.itcast.day10.Demo03;

public class Test {
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.havePet(ani);
        Dog dog=(Dog)ani;
        System.out.println("==================");
        dog.eat();
    }
}
