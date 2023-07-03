import java.util.List;

public class MagicianHero extends BaseHero {
    public MagicianHero(String namePerson, int x, int y) {
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