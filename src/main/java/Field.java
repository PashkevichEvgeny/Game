/**
 * 1. Создать класс с описанием координат, x и y.
 * 2. Добавить в абстрактный класс поле с координатами и пробросить его инициализацию до конструкторов персонажей.
 *    Farmer farmer = new Farmer(getName(), x, y);
 * 3 Поиск среди противников наиболее приближённого . Вывести расстояние до него и его имя в консоль.
 */
public class Field {
    public int x;
    public int y;

    public Field(int x, int y) {
        this.x = x;
        this.y = y;
    }
}