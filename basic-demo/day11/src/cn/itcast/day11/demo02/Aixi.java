package cn.itcast.day11.demo02;

public class Aixi {
    private String name;
    private Skill skill;
    public void attack(){
        skill.use();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Aixi(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public Aixi() {
    }
}
