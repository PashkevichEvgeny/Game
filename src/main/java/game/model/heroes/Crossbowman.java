package game.model.heroes;

import game.model.Arena;
import game.model.BaseHero;

import java.util.List;
public class Crossbowman extends ShooterHero {
    public Crossbowman(String namePerson, Arena position) {
        super(namePerson,
                10,
                10,
                10,
                10,
                State.Stand,
                position,
                3);
        this.setInitiate(this.getInitiate() + 2);
    }
    public String getInfo(){
        return super.getInfo();
    }
    public String getName(){
        return name;
    }
    public void step(List<BaseHero> ourTeam, List<BaseHero> oppositeTeam) {
        super.step(ourTeam, oppositeTeam);
    }
}
