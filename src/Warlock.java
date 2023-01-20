public class Warlock extends Healers {
    int magic;

    public Warlock(String name, String role, int attack, int protection, int[] damage, int health, int speed, int mana, int magic) {
        super(name, role, attack, protection, damage, health, speed, mana);
        this.magic = magic;
    }

    public Warlock(String name){
        super(name, "Warlock", 17,12,new int[] {-5,-5},30,9, 9);
        this.magic = 1;
    }

    @Override
    public void step(){

    }

    @Override
    public String toString() {
        return super.toString() + ".  Magic: " + magic;
    }
}
