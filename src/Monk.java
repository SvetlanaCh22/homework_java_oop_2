public class Monk extends Healers{
    int magic;

    public Monk(String name, String role, int attack, int protection, int[] damage, int health, int speed, int mana, int magic) {
        super(name, role, attack, protection, damage, health, speed, mana);
        this.magic = magic;
    }

    public Monk(String name){
        super(name, "Monk",12,7,new int[] {-4,-4},30,5, 5);
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
