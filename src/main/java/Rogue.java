import java.util.List;

public class Rogue extends FootSoldierHero {
    Rogue(String namePerson, int x, int y){ super("Разбойник", 0, 0);}
    @Override
    public void step(){}
    @Override
    public String getInfo(){
        return namePerson;
    }
    public String getName(){
        return namePerson;
    }
}
