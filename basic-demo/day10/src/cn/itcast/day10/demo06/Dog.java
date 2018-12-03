package cn.itcast.day10.demo06;

public class Dog extends Animal implements Sport{
    @Override
    public void speak(String str) {
        System.out.println(super.name+"说："+str);
    }
    @Override
    public void swimming() {
        System.out.println(super.name+"狗刨中!");
    }
    public void goPlay(){
        String str="我去玩了!";
        speak(str);
        swimming ();
    }

    public Dog(String name) {
        super(name);
    }

    public Dog() {
    }
}
