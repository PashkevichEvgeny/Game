package game.model.heroes;

import game.model.Arena;
import game.model.BaseHero;

import java.util.List;
import java.util.Random;

public class MagicianHero extends BaseHero {
    public MagicianHero(String namePerson,
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
                10,
                state,
                position);
    }
    public String getName(){
        return name;
    }
    public String getInfo(){
        return super.getInfo();
    }
    public void step(List<BaseHero> ourTeam, List<BaseHero> oppositeTeam) {
        ourTeam.sort((o1, o2) -> {
            if (o1.gethP() - o2.gethP() == 0) {
                return o1.gethP() - o2.gethP() - new Random().nextInt(2);
            }
            return o1.gethP() - o2.gethP();
        });               // получает список своих отсортированный по степени живости
    }
}