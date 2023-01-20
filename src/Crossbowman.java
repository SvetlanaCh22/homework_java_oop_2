public class Crossbowman extends Hero{
    int shots;

    public Crossbowman(String name, String role, int attack, int protection, int[] damage, int health, int speed, int shots) {
        super(name, role, attack, protection, damage, health, speed);
        this.shots = shots;
    }

    public Crossbowman(String name){
        super(name, "Crossbowman",6,3,new int[] {2,3},10,4);
        this.shots = 16;
    }

    @Override
    public String toString() {
        return super.toString() + ".  Shots: " + shots;
    }
}
