public class Peasant extends Hero {
    int delivery;
    public Peasant(String name, String role, int attack, int protection, int[] damage, int health, int speed, int delivery) {
        super(name, role, attack, protection, damage, health, speed);
        this.delivery = delivery;
    }

    public Peasant(String name){
        super(name, "Peasant",1,1, new int[] {1,1},1,3);
        this.delivery = 1;
    }
    @Override
    public String toString(){
        return super.toString() + ".  Delivery: " + delivery;
    }
}

