import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameMechanic {
    public static List<BaseHero> fillTeam(boolean side){
        int commandSize = 10;
        List<BaseHero> team = new ArrayList<>();
        for (int i = 0; i < commandSize; i++) {
            int coordX = 1;
            int coordY = i + 1;
            if (side) coordX = 10;
            int cnt = new Random().nextInt(2);
            switch (cnt) {
                case 0 -> team.add(new Rogue("Разбой" + i, coordX, coordY));
                case 1 -> team.add(new Monk("Монахx" + i, coordX, coordY));
            }
        }
        return team;
    }
}
