package cn.itcast.day06.demo02;

public class Coder {
    private String name;
    private String id;
    private int salary;
    public void work(){
        System.out.println("工号为"+id+"基本工资为"+salary+"的"+name+"正在努力的写着代码......");
    }
    public Coder() {
    }
    public Coder(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
