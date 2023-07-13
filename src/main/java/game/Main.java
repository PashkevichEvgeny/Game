package game;

import game.model.BaseHero;
import game.model.GameMechanic;

import java.util.*;

public class Main {
        public static final int[] countDeadGood = {0};
        public static final int[] countDeadBad = {0};
        public static final List<BaseHero> teamGood = GameMechanic.fillTeam(false);
        public static final List<BaseHero> teamEvil = GameMechanic.fillTeam(true);
        public static final List<BaseHero> allTeam = GameMechanic.mergedTeam(teamGood, teamEvil);
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String makeStep = "";
        while (!makeStep.equals("q")) {
        GameMechanic.letsBattle(teamGood, teamEvil);
        teamGood.forEach((v) -> countDeadGood[0] += (BaseHero.State.Dead.equals(v.state))? 1:0);
        teamEvil.forEach((v) -> countDeadBad[0] += (BaseHero.State.Dead.equals(v.state))? 1:0);
        View.view();
        if (countDeadGood[0] == 10) {
            System.out.println("Добро победило!");
            break;
        }
        if (countDeadBad[0] == 10) {
            System.out.println("Зло торжетсвует!");
            break;
        }
        System.out.println(countDeadGood[0] + " " + countDeadBad[0]);
        countDeadGood[0] = 0;
        countDeadBad[0] = 0;
        makeStep = in.nextLine();
        }
    }
}
