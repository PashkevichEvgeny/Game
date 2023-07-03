import java.util.List;

public class Monk extends MagicianHero {
    public Monk(String namePerson, int x, int y)
    {
        super("Монах", 0, 0);
    }
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
