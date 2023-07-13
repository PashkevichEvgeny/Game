package game.model.heroes;

import game.model.Arena;
import game.model.BaseHero;

import java.util.List;
import java.util.Random;

/**
 * Герой этого класса должны ходить по полю
 */
public class InfantryHero extends BaseHero {
    public InfantryHero(String namePerson,
                        int hP,
                        int maxHP,
                        int defense,
                        int damage,
                        State state,
                        Arena position) {
        super(namePerson,
                hP,
                maxHP,
                defense,
                damage,
                15,
                state,
                position);
    }
    public String getName(){
        return name;
    }
    public String getInfo(){
        return super.getInfo();
    }
    @Override
    public void step(List<BaseHero> ourTeam, List<BaseHero> oppositeTeam) {
        if (State.Dead.equals(this.state)) return;                    // если мерт, то тихо лежит
        super.step(ourTeam, oppositeTeam);
        Arena curPosition = this.getPosition();
        switch (curPosition.getX()){
            case 1, 2, 3, 4 -> curPosition.setX(curPosition.getX() + 1);
            case 5, 6 -> curPosition.setX(curPosition.getX() + new Random().nextInt(-3 , +3));
            case 7, 8, 9, 10 -> curPosition.setX(curPosition.getX() - 1);
        }
    }
}
