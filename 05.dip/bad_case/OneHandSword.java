import java.util.Random;

public class OneHandSword {
    private final String NAME;
    private final int DAMAGE;

    public OneHandSword(String name, int damage) {
        this.NAME = name;
        this.DAMAGE = damage;
    }

    public int attack() {
        return DAMAGE + new Random().nextInt(10) - 5;
    }

    @Override
    public String toString() {
        return NAME;
    }
}