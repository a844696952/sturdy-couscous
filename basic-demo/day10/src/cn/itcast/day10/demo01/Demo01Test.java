package cn.itcast.day10.demo01;

public class Demo01Test {
    public static void main(String[] args) {
        Demo01Impl imp = new Demo01Impl();
        imp.method1();
        imp.method2();
        imp.method3();
        InterfaceImpl in= new InterfaceImpl();
        Interface.method();
        in.def();
        imp.def();
    }
}
