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
        var sniper1 = new Sniper(1, 1, "Снайпер");
        var sorcerer1 = new Sorcerer(1, 1, "Колдун");
        var spearman1 = new Spearman(1, 1, "Копейщик");
        var crossbowman1 = new Crossbowman(1, 1, "Арбалетчик");
        var monk1 = new Monk(1, 1, "Монах");
        System.out.println(peasant1.somePeasantAction2());
        System.out.println(sorcerer1.someSorcererAction(10));
        System.out.println(spearman1.setSpearmanValue(10));
        System.out.println(crossbowman1.getCrossbowmanValue3());
        sniper1.setNamePerson("Снайрер Вася");
        sniper1.sayName();
        sniper1.sayCategory();
        sniper1.sayProfession();
        System.out.println(sniper1.getHealthPoint());
        sniper1.toEat();
        System.out.println(sniper1.getHealthPoint());
        monk1.sayName();
        System.out.println(monk1.getHealthPoint());
        spearman1.sayName();
    }

}
