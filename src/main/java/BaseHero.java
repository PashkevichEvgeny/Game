import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.*;

public abstract class BaseHero implements GameInterface {
    protected String namePerson;
    protected int healthPoint;
    protected int damage;
    protected int initiate;
    private Field fields;

    public BaseHero(String namePerson, int healthPoint, int damage, int initiate, int x, int y) {
        this.namePerson = namePerson;
        this.healthPoint = healthPoint;
        this.damage = damage;
        this.initiate = initiate;
        this.setFields(new Field(x, y));
    }

    public String getName() {
        return namePerson;
    }

    @Override
    public void step(List<BaseHero> oppositeTeam) {
        BaseHero nearestEnemy = lookForEnemy(oppositeTeam);
        System.out.printf("%s ближайший противник %s на расстоянии %.2f\n", getName(), nearestEnemy.getName(), distance(nearestEnemy));
    }

    public Field getFields() {
        return fields;
    }

    public void setFields(Field fields) {
        this.fields = fields;
    }

    public BaseHero lookForEnemy(List<BaseHero> oppositeTeam) {
        double dis;
        BaseHero enemy = oppositeTeam.get(0);
        double nearestDistance = distance(enemy);
        for (BaseHero enemyItem : oppositeTeam) {
            dis = distance(enemyItem);
            if (dis < nearestDistance) {
                nearestDistance = dis;
                enemy = enemyItem;
            }
        }
        return enemy;
    }
    public double distance(BaseHero player2){
        return sqrt(pow(player2.getFields().getX() - getFields().getX(), 2)
                  + pow(player2.getFields().getY() - getFields().getY(), 2));
    }
}