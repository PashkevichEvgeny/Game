import java.util.List;
public class InfantryHero extends BaseHero{
    public InfantryHero(String namePerson, int healthPoint, int damage, int initiate, int x, int y) {
        super(namePerson, healthPoint, damage, initiate, x, y);
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
