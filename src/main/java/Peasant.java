import java.util.List;

public class Peasant extends PeonHero {
    public Peasant(String namePerson, int x, int y) {
        super(namePerson, 10, 1, 5, x, y);
    }
    public String getInfo(){
        return namePerson;
    }
    public String getName(){
        return namePerson;
    }
    public void step(List<BaseHero> oppositeTeam) {
        super.step(oppositeTeam);
    }
}
