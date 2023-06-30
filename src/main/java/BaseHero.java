import java.util.List;
import java.util.Random;
public abstract class BaseHero implements GameInterface{
    private static int count;
    private int healthPoint;  // Очки здоровья
    private int damage;       // Сила удара
    private int defence;      // Броня
    private String namePerson;

    BaseHero(int healthPoint, int damage, int defence, String namePerson) {
        this.healthPoint = healthPoint;
        this.damage = damage;
        this.defence = defence;
        this.namePerson = namePerson + "#" + ++count;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getNamePerson() { return this.namePerson; }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
    public void toTakeAHit(int damage) {
        this.setHealthPoint(Math.max(this.getHealthPoint() + this.getDefence() - damage, 0));
    }
    public abstract String die();

    public void Attack(BaseHero target) {
        this.setDamage(new Random().nextInt(this.damage - 10, this.damage + 10));
        target.toTakeAHit(this.getDamage());
    }
}