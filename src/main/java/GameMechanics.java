import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameMechanics {
    public static int testBattle(List<BaseHero> team1, List<BaseHero> team2, boolean que){
        int team1Alive = 0;
        int team2Alive = 0;
        int start = que ? 0 : team1.size() / 2;
        int length = que ? team1.size() / 2 : team1.size();
        for (int i = start; i < length; i++) {
            team1.get(i).Attack(team2.get(i));             // 1 -> 2
            if (team2.get(i).getHealthPoint() > 0){       // if 2 > 0 -
                team2Alive++;                             //  2++
                team2.get(i).Attack(team1.get(i));        //  2 -> 1
            }
            if (team1.get(i).getHealthPoint() > 0) team1Alive++;
        }
        return team1Alive - team2Alive;
    }
    public static List<BaseHero> fillTeam(){
        int commandSize = 10;
        List<BaseHero> team = new ArrayList<>();
        for (int i = 0; i < commandSize; i++) {
            int cnt = new Random().nextInt(7);
            switch (cnt) {
                case 0 -> team.add(new Rogue());
                case 1 -> team.add(new Monk());
                case 2 -> team.add(new Peasant());
                case 3 -> team.add(new Crossbowman());
                case 4 -> team.add(new Sniper());
                case 5 -> team.add(new Sorcerer());
                case 6 -> team.add(new Spearman());
            }
        }
        return team;
    }
}
