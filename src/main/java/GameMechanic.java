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
            int cnt = new Random().nextInt(7);
            switch (cnt) {
                case 0 -> team.add(new Robber("Разбой" + i, coordX, coordY));
                case 1 -> team.add(new Monk("Монахь" + i, coordX, coordY));
                case 2 -> team.add(new Peasant("Фермер" + i, coordX, coordY));
                case 3 -> team.add(new Crossbowman("Арбале" + i, coordX, coordY));
                case 4 -> team.add(new Spearman("Копейщ" + i, coordX, coordY));
                case 5 -> team.add(new Sorcerer("Колдуй" + i, coordX, coordY));
                case 6 -> team.add(new Archer("Лучник" + i, coordX, coordY));
            }
        }
        return team;
    }
}
