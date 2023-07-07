import java.util.List;
public class ShooterHero extends BaseHero{
    protected int amountArrows;
    public ShooterHero(String namePerson, int healthPoint, int damage, int initiate, int amountArrows, int x, int y) {
        super(namePerson, healthPoint, damage, initiate, x, y);
        this.amountArrows = amountArrows;
    }
    public String getName(){
        return namePerson;
    }
    public String getInfo(){
        return namePerson;
    }
    public void step(List<BaseHero> oppositeTeam) {
        super.step(oppositeTeam);
    }
}
