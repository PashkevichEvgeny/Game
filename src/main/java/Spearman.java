import java.util.List;
public class Spearman extends InfantryHero{
    public Spearman(String namePerson, int x, int y) {
            super(namePerson, 10, 10, 3, x, y);
        }
        public String getInfo(){ return namePerson; }
        public String getName(){ return namePerson;}
        public void step(List<BaseHero> oppositeTeam) {
            super.step(oppositeTeam);
    }
}
