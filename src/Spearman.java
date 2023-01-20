public class Spearman extends Hero{

    public Spearman(String name, String role, int attack, int protection, int[] damage, int health, int speed) {
        super(name, role, attack, protection, damage, health, speed);
    }

    public Spearman(String name){
        super(name, "Spearman",4,5,new int[] {1,3},10,4);
    }
}
