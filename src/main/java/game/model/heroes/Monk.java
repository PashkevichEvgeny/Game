package game.model.heroes;

import game.model.Arena;
import game.model.BaseHero;

import java.util.List;
public class Monk extends MagicianHero {
    public Monk(String namePerson, Arena position) {
        super(namePerson,
                10,
                10,
                10,
                5,
                State.Stand,
                position);
        this.setInitiate(this.getInitiate() + 2);
    }
    @Override
    public String getInfo(){
        return super.getInfo();
    }
    public String getName(){
        return name;
    }
    public void step(List<BaseHero> ourTeam, List<BaseHero> oppositeTeam) {
        super.step(ourTeam, oppositeTeam);
        BaseHero wia = ourTeam.get(0);                                                    // лечит всех своих, ставит на ноги даже убитых
        if (wia.gethP() + damage > wia.getMaxHP()) damage = wia.getMaxHP() - wia.gethP();
        wia.getDamage(-damage);
        if (wia.gethP() > 0 && State.Dead.equals(wia.state)) {
            wia.state = State.Stand;
//            System.out.println(getName() + " - Вставай, сын мой, " + wia.getName());
        }
    }
}
