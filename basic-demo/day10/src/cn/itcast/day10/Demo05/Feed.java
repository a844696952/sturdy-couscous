package cn.itcast.day10.Demo05;

public class Feed {
    public void feed(Animal animal) {
        if (animal instanceof Forg) {
            Forg forg=(Forg)animal;
            forg.eat();
            forg.drink();
            forg.swim();
        } else if (animal instanceof Dog) {
            Dog dog=(Dog)animal;
            dog.eat();
            dog.drink();
            dog.swim();
        } else if (animal instanceof Sheep) {
            Sheep sheep=(Sheep)animal;
            sheep.eat();
            sheep.drink();
        }
    }
}
