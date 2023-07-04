public class Monk extends MagicianHero{
    public Monk(String namePerson, int x, int y) {
        super(namePerson, 10, 10, x, y);
    }
    @Override
    public String getInfo(){
        return namePerson;
    }
    public String getName(){
        return namePerson;
    }
}
