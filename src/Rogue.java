public class Rogue extends Hero {

    public Rogue(String name, String role, int attack, int protection, int[] damage, int health, int speed) {
        super(name, role, attack, protection, damage, health, speed);
    }

    public Rogue(String name){
        super(name, "Rogue",8,3, new int[] {2,4},10,6);
    }
}
