package game.model.heroes;

import game.model.Arena;
import game.model.BaseHero;

import java.util.List;
public class Robber extends InfantryHero {
    public Robber(String namePerson, Arena position){
        super(namePerson,
                10,
                10,
                10,
                10,
                State.Stand,
                position);
        this.setInitiate(this.getInitiate() + 1);
    }
    public String getInfo(){ return super.getInfo(); }
    public String getName(){ return name; }
    public void step(List<BaseHero> ourTeam, List<BaseHero> oppositeTeam) {
        super.step(ourTeam, oppositeTeam);
    }
}
