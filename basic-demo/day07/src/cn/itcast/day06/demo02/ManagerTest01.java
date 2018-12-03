package cn.itcast.day06.demo02;

public class ManagerTest01 {
    public static void main(String[] args) {
        Manager man=new Manager("项目经理","123",15000,6000);
        man.work();
        Coder cod=new Coder("程序员","135",10000);
        cod.work();
        System.out.println("====================");
        Manager man1=new Manager();
        Manager cod1=new Manager();
        man1.setBonus(6000);
        man1.setSalary(15000);
        man1.setName("项目经理");
        man1.setId("123");
        cod1.setSalary(10000);
        cod1.setName("程序员");
        cod1.setId("135");
        man1.work();
        cod1.work();
    }
}
