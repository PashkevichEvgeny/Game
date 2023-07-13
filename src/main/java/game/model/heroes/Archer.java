package game.model.heroes;

import game.model.Arena;
import game.model.BaseHero;

import java.util.List;
public class Archer extends ShooterHero {
    public Archer (String namePerson, Arena position) {
        super(namePerson,
                10,
                10,
                10,
                10,
                State.Stand,
                position,
                3);
        this.setInitiate(this.getInitiate() + 1);
    }
    public String getName(){
        return name;
    }
    @Override
    public void step(List<BaseHero> ourTeam, List<BaseHero> oppositeTeam) {
        if (this.amountArrows < 1) return;                                    // Если есть стрелы
        super.step(ourTeam, oppositeTeam);                                    // ищет ближайшего противиника и наносит урон ему
        for (BaseHero item: ourTeam) {                                        //
            if (item instanceof Peasant && State.Stand.equals(item.state)) {  // Ищет в команде свободного крестьянина
                item.state = State.Busy;                                      // и поручает ему дело - принести стрелу
                return;
            }
        }
        this.amountArrows--;                                                  // количество стрел уменьшается, если крестьянина под рукой нет
    }
    @Override
    public String getInfo(){
        return super.getInfo() + " ➹:" +  this.amountArrows;
    }
}

