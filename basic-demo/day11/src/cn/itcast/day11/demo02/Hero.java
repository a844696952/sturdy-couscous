package cn.itcast.day11.demo02;

public class Hero {
    private String name;
    private Weapon weapon;
    private int age;
    public void attack(){
        System.out.println(age+"岁的"+name+"正在用"+weapon.getCode()+"攻击敌人");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Hero(String name, Weapon weapon, int age) {
        this.name = name;
        this.weapon = weapon;
        this.age = age;
    }

    public Hero() {
    }
}
