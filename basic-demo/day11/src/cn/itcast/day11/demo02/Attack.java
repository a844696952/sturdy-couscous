package cn.itcast.day11.demo02;

public class Attack {
    public static void main(String[] args) {
        Weapon weapon = new Weapon("大宝剑");
        Hero hero = new Hero("盖伦",weapon,28);
        hero.attack();
        Aixi ai = new Aixi();
        ai.setName("艾希");
        ai.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("biu~biu~biu");
            }
        });
        ai.attack();
    }
}
