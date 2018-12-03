package cn.itcast.day06.demo02;

public class CatTest {
    public static void main(String[] args) {
        Cat cat=new Cat();
        Dog dog=new Dog();
        cat.setBreed("波斯猫");
        cat.setColor("花色");
        cat.eat();
        cat.catchMouse();
        dog.setBreed("藏獒");
        dog.setColor("黑色");
        dog.lookHome();
        dog.eat();
        System.out.println("==============");
        Cat cat1=new Cat("波斯猫","花色");
        Dog dog1=new Dog("黑色","藏獒");
        cat1.eat();
        cat1.catchMouse();
        dog1.lookHome();
        dog1.eat();
    }
}
