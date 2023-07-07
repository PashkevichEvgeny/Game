import java.util.List;
public class Archer extends ShooterHero{
    public Archer (String namePerson, int x, int y) {
        super(namePerson, 10, 10, 10, 3, x, y);
    }
    public String getInfo(){
        return namePerson;
    }
    public String getName(){
        return namePerson;
    }
    @Override
    public void step(List<BaseHero> oppositeTeam) {
        super.step(oppositeTeam);
//        if (this.healthPoint <= 0) return;
//        if (this.amountArrows <= 0) return;
//        System.out.println("еще " + this.amountArrows + " стрелы и " + this.healthPoint + " здоровья");
//        for (BaseHero item: oppositeTeam) if (item instanceof Rogue) return;
    }
}

