import java.util.List;

public class FootSoldierHero extends BaseHero {
    public FootSoldierHero(String namePerson, int x, int y) {
        super(namePerson, x, y);
    }
    public String getName(){
        return namePerson;
    }
    public void step(){}

    @Override
    public void step(List<BaseHero> oppositeTeam) {

    }

    @Override
    public String getInfo(){
        return "";
    }
}
