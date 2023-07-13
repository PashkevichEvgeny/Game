package game.model.heroes;

import game.model.Arena;
import game.model.BaseHero;

import java.util.List;
public class Sorcerer extends MagicianHero {
    public Sorcerer(String namePerson, Arena position) {
        super(namePerson,
                10,
                10,
                10,
                10,
                State.Stand,
                position);
        this.setInitiate(this.getInitiate() + 1);
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
        BaseHero wia = null;
        for (BaseHero itemWia: ourTeam) {                       // ищет самого раненого, но еще живого и лечит его
            if (!State.Dead.equals(itemWia.state)){
                wia = itemWia;
                break;
            }
        }
        if (wia == null) return;
        if (wia.gethP() + damage > wia.getMaxHP()) damage = wia.getMaxHP() - wia.gethP();
        wia.getDamage(-damage);
//        System.out.println(getName() + " подлечил " + wia.getName());
    }
}
