package cn.itcast.day09.four;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("赵四",18);
        Dog dog = new Dog(9,"黑色");
        Cat cat = new Cat(6,"花色");
        String c="鱼",d="骨头";
        person.keepPet(cat,c);
        person.keepPet(dog,d);
    }
}