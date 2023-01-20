import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Hero {
    String name, role;
    int attack, protection, maxhealth, health, speed;
    int[]damage;

     public Hero(String name, String role, int attack, int protection, int[]damage, int health, int speed){
        this.name = name;
        this.role = role;
        this.attack = attack;
        this.protection = protection;
        this.damage =damage;
        this.maxhealth = health;
        this.health = maxhealth - new Random().nextInt(maxhealth);
        this.speed = speed;
     }

     public String getInfo(){
        return role + ", health: " + health + " / " + maxhealth;
     }

    public String getName(){
        return name;
    }

    public String getRole(){
        return role;
    }

    public int getHealth(){
        return health;
    }

    public int getMaxHealth(){
        return maxhealth;
    }

    public void step(ArrayList<Hero> heroList) {

    }

     @Override
     public String toString(){
        return ("Name: " + name + ".  Attack: " + attack + ".  Protection: " + protection +
                ".  Damage: " + Arrays.toString (damage) + ".  Health: " + health +
                ".  Speed: " + speed);
    }
}
