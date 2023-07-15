package game.model.heroes;

import game.model.Arena;
import game.model.BaseHero;
import game.model.GameMechanic;

import java.util.List;
public class Crossbowman extends ShooterHero {
    public Crossbowman(String namePerson, Arena position) {
        super(namePerson,
                10,
                10,
                10,
                1,
                State.Stand,
                position,
                5);
        this.setInitiate(this.getInitiate() + 2);
    }
    public String getInfo(){
        return super.getInfo();
    }
    public String getName(){
        return name;
    }
    public void step(List<BaseHero> ourTeam, List<BaseHero> oppositeTeam) {
        if (State.Dead.equals(this.state)) return;
        if (this.amountArrows < 1) {
            this.getDamage(1);
            return;
        }
        BaseHero victim = lookForEnemy(oppositeTeam);
        if (victim == null) return;
        victim.getDamage(damage);
        this.amountArrows--;
    }
}
