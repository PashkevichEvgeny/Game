import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<BaseHero> teamGood = GameMechanic.fillTeam(false);
        List<BaseHero> teamEvil = GameMechanic.fillTeam(true);
        for (BaseHero baseHero : teamEvil)  baseHero.step(teamGood);
        var warrior = teamGood.get(new Random().nextInt(10));
        System.out.println(warrior.getName() + " пошел в атаку на врага -------------->");
        warrior.setFields(new Field(5, 5));   // Проверочное выдвижение персонажа
        for (BaseHero baseHero : teamEvil)  baseHero.step(teamGood);
//        List<BaseHero> AllHero = new ArrayList<>();
//        AllHero.addAll(teamGood);
//        AllHero.addAll(teamEvil);
//        AllHero.sort(new Comparator<BaseHero>() {
//            @Override
//            public int compare(BaseHero o1, BaseHero o2) {
//                return o1.initiate - o2.initiate;
//            }
//        });
//        for (BaseHero baseHero : teamGood) {
//            if (teamGood.contains(baseHero)){
//                System.out.printf("%s %d ", baseHero.getInfo(), baseHero.healthPoint);
//                baseHero.step(teamGood);
//            }
//        }
//            System.out.printf("%s ", baseHero.getInfo());
    }
}
