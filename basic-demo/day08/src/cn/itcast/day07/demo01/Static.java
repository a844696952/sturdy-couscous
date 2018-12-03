package cn.itcast.day07.demo01;

public class Static {
    private String name;
    static String clazz;
    private int age;

    public Static(String name, int age) {
        this.name = name;
        this.age = age;
        this.clazz=clazz;

    }
    static {
        System.out.println("静态代码块");
    }
    public Static() {
    }

    public String getName() {
        this.clazz=clazz;
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getClazz() {
        return clazz;
    }

    public static void setClazz(String clazz) {
        Static.clazz = clazz;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
