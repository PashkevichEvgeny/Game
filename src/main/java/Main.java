import java.util.ArrayList;
import java.util.List;

/**
 * Крестьянин, разбойник, снайпер, колдун, копейщик, арбалетчик, монах.
 * Для каждого сформировать список свойств и возможных действий.
 * Напрнимер свойство скорость, действие, нанести удар.
 * Проанализировать получившиеся свойства и действия персонажей и
 * создать Обобщённый класс описывающий свойства и действия имеющиеся у всех персонажей.
 * Создать этот класс. Создать классы для каждого типа персонажей наследующие и
 * расширяющие абстрактный(обобщённый) класс. В основной программе создать
 * по одному экземпляру каждого типа персонажей.
 */
public class Main {
    public static void main(String[] args) {
        var peasant1 = new Peasant(1, 1, "Крестьянин");
        var rogue1 = new Rogue();
        var sniper1 = new Sniper(1, 1, "Снайпер");
        var sorcerer1 = new Sorcerer(1, 1, "Колдун");
        var spearman1 = new Spearman(1, 1, "Копейщик");
        var crossbowman1 = new Crossbowman(1, 1, "Арбалетчик");
        var monk1 = new Monk(1, 1, "Монах");
        sniper1.setNamePerson("Снайрер Вася");
        List<BaseClass> listPersons = new ArrayList<>();
        listPersons.add(peasant1);
        listPersons.add(rogue1);
        listPersons.add(sniper1);
        listPersons.add(sorcerer1);
        listPersons.add(crossbowman1);
        listPersons.add(spearman1);
        listPersons.add(monk1);
        rogue1.toEat();
        peasant1.toEat();
        rogue1.Attack(sniper1);
        for (BaseClass item: listPersons) {
            item.sayName();
            System.out.println(item.getHealthPoint());
        }
    }

}
