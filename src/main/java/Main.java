import com.heroes.BaseHero;
import com.heroes.Arena;
import com.heroes.GameMechanic;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<BaseHero> teamGood = GameMechanic.fillTeam(false);
        List<BaseHero> teamEvil = GameMechanic.fillTeam(true);
        System.out.println("\n");
        List<BaseHero> AllHero = new ArrayList<>();
        AllHero.addAll(teamGood);
        AllHero.addAll(teamEvil);
        AllHero.get(5).setPosition(new Arena(5, 5));
        AllHero.sort((o1, o2) -> {
            if (o2.getInitiate() - o1.getInitiate() == 0) {
                return o2.getInitiate() - o1.getInitiate() - new Random().nextInt(2);
            }
            return o2.getInitiate() - o1.getInitiate();
        });
//        AllHero.sort((o1, o2) -> o2.getInitiate() - o1.getInitiate());
        for (BaseHero baseHero : AllHero) {
            if (teamGood.contains(baseHero)) { baseHero.step(teamGood, teamEvil); }
            else { baseHero.step(teamEvil, teamGood); }
        }
    }
}
