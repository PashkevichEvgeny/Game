import com.heroes.BaseHero;
import com.heroes.Arena;
import com.heroes.GameMechanic;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<BaseHero> teamGood = GameMechanic.fillTeam(false);
        List<BaseHero> teamEvil = GameMechanic.fillTeam(true);
        teamEvil.get(5).setPosition(new Arena(5, 5));
        System.out.println("-".repeat(35));
        GameMechanic.letsBattle(teamGood, teamEvil);
        System.out.println("-".repeat(35));
        GameMechanic.letsBattle(teamGood, teamEvil);
        System.out.println("-".repeat(35));
        GameMechanic.letsBattle(teamGood, teamEvil);
    }
}
