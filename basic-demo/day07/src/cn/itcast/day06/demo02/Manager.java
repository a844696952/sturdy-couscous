package cn.itcast.day06.demo02;

public class Manager {
    private String name;
    private String id;
    private int salary;
    private int bonus;

    public  void work(){
        System.out.println("工号为"+id+"工资为"+salary+"奖金为"+bonus+"的"+name+"正在.....");
    }
    public Manager() {
    }
    public Manager(String name, String id, int salary, int bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
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
    public int getBonus() {
        return bonus;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
