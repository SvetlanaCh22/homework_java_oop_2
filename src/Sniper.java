public class Sniper extends Hero {
    int shots;

    public Sniper(String name, String role, int attack, int protection, int[] damage, int health, int speed, int shots) {
        super(name, role, attack, protection, damage, health, speed);
        this.shots = shots;
    }

    public Sniper(String name){
        super(name, "Sniper", 12,10, new int[] {8,10},15,9);
        this.shots = 32;
    }

    @Override
    public String toString(){
        return super.toString() + ".  Shots: " + shots;
    }

}
