package cn.itcast.day10.Demo05;

public class Test {
    public static void main(String[] args) {
        Feed feed = new Feed();
        Animal one=new Sheep();
        Animal two=new Dog();
        Animal three=new Forg();
        feed.feed(one);
        feed.feed(two);
        feed.feed(three);
    }
}
