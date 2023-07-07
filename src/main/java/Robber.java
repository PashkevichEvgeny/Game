import java.util.List;
public class Robber extends CrimeHero{
    Robber(String namePerson, int x, int y){ super(namePerson, 10, 10, 5, x, y);}
    public String getInfo(){ return namePerson; }
    public String getName(){ return namePerson; }
    public void step(List<BaseHero> oppositeTeam) {
        super.step(oppositeTeam);
    }
}
