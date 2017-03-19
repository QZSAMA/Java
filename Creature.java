//Xinyu Xiong


import java.io.Serializable;


public class Creature implements Serializable {
    private int age;    //maximum age is 40
    private int energy; //maximum energy is 100
    private int num;    //num means different type of creature.  1 means plant, 2 means herbivore and 3 means carnivore
    private int x;      //x coordinate
    private int y;		//y coordinate
    private int moved;
    private int ate;

    public Creature(int num) {
        this.num=num;
        this.age=0;
        if(num!=1) {
            this.energy=(int) (51*Math.random()+50);
            // energy ranges from 50 to 100
            this.moved=0;
            this.ate=0;
        }
    }
    public int getAge() {return this.age;}
    public void setAge(int age) {this.age=age;}
    public int getEnergy() {return this.energy;}
    public void setEnergy(int energy) {this.energy=energy;}
    public int getNum() {return num;}
    public void setNum(int num) {this.num=num;}
    public void setMoved(int status) {this.moved=status;}
    public int getMoved() {return moved;}
    public void setAte(int status) {this.ate=status;}
    public int getAte() {return ate;}
}
