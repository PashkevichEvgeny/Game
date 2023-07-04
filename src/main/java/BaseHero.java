import java.util.List;
import static java.lang.Math.*;

public abstract class BaseHero implements GameInterface {
    protected String namePerson;
    protected int healthPoint;
    protected int damage;
    private Field fields;
    public BaseHero(String namePerson, int healthPoint, int damage, int x, int y) {
        this.namePerson = namePerson;
        this.healthPoint = healthPoint;
        this.damage = damage;
        this.setFields(new Field(x, y));
    }
    public String getName(){
        return namePerson;
    }
    @Override
    public void step(List<BaseHero> oppositeTeam) {
        int x1 = getFields().getX();
        int y1 = getFields().getY();
        int x2, y2;
        double distance;
        double nearestDistanceEnemy = pow(10, 2);
        String nameNearestEnemy = "";
        for (BaseHero enemy: oppositeTeam) {
            x2 = enemy.getFields().getX();
            y2 = enemy.getFields().getY();
            distance = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
            if (distance < nearestDistanceEnemy){
                nearestDistanceEnemy = distance;
                nameNearestEnemy = enemy.getName();
            }
        }
        System.out.println("Расстояние до противника " + nearestDistanceEnemy + ", его имя " + nameNearestEnemy);
    }
    public Field getFields() {
        return fields;
    }
    public void setFields(Field fields) {
        this.fields = fields;
    }
}