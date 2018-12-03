package cn.itcast.day09.Test;

public class Cat {
    private int color;//除以2没有余数是黑猫,有余数是白猫
    private float weight;//单位kg  *float*类型
    public void eatFood(boolean a){
        if(a){
            System.out.println("好香好好吃");
        }else{
            System.out.println("gui");
        }
    }
    public void catchMouse(){
        if (this.weight>50){
            System.out.println("喵喵喵我爱抓老鼠");
        }else if (this.weight>10&&this.weight<=50){
            System.out.println("人家是小猫猫害怕老鼠嘛");
        }else if (this.weight<=10&&this.weight>0){
            System.out.println("喵了个咪差点被老鼠吃了");
        }
    }
    public void method(){
        shit();
    }
    private void shit(){
        System.out.println("拉屎");
    }
    public void speekMyColor(){
        if (this.color%2==0){//黑猫
            System.out.println("喵我是黑猫");
        }else{//白猫
            System.out.println("喵我是白猫");
        }
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Cat(int color, float weight) {
        this.color = color;
        this.weight = weight;
    }

    public Cat() {
    }
}
