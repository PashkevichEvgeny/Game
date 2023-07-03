import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**Задание1
 * Крестьянин, разбойник, копейщик, снайпер, арбалетчик, колдун, монах.
 * Для каждого сформировать список свойств и возможных действий.
 * Напрнимер свойство скорость, действие, нанести удар.
 * Проанализировать получившиеся свойства и действия персонажей и
 * создать Обобщённый класс описывающий свойства и действия имеющиеся у всех персонажей.
 * Создать этот класс. Создать классы для каждого типа персонажей наследующие и
 * расширяющие абстрактный(обобщённый) класс. В основной программе создать
 * по одному экземпляру каждого типа персонажей.
 * Задание2
 * Добавить файл с описанием интерфейса.
 * В котором описать два метода, void step(); и String getInfo();
 * Реализовать интерфейс в абстрактном классе и в наследниках так,
 * чтобы getInfo возвращал тип персонажа. Создать два списка в классе main.
 * В каждый из списков добавить по десять экземпляров наследников BaseHero.
 * Удалить ненужные методы из абстрактного класса, если такие есть.
 * В main пройти по спискам и вызвать у всех персонажей getInfo.
 */
public class Main {
    public static void main(String[] args) {
        List<BaseHero> teamGood = fillTeam();
        List<BaseHero> teamEvil = fillTeam();
        for (int i = 0; i < teamGood.size(); i++) {
            System.out.printf("%s VS %s\n",
                    teamGood.get(i).getInfo(),
                    teamEvil.get(i).getFields().y);
        }
    }
    public static List<BaseHero> fillTeam(){
        int commandSize = 10;
        List<BaseHero> team = new ArrayList<>();
        for (int i = 0; i < commandSize; i++) {
            int cnt = new Random().nextInt(2);
            switch (cnt) {
                case 0: {
                    team.add(new Rogue("", 1000, 100));
                    break;
                }
                case 1: {
                    team.add(new Monk("", 1, 1));
                    break;
                }
            }
        }
        return team;
    }
}

