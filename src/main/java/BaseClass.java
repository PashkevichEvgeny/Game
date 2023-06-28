public abstract class BaseClass{
    private static int count = 0;
    private int healthPoint;  // Очки здоровья
    private int attack;       // Сила удара
    private int defence;      // Броня
    private String someValue3;
    private String namePerson;
    BaseClass(){
        this.defence = 10;
        int id = count++;
        this.namePerson = "DefaultName" + id;
        this.healthPoint = 50;
        this.attack = 10;
        this.someValue3 = "Very Interesting Information";
    }


    public int getHealthPoint() {
        return healthPoint;
    }

    public int setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
        return healthPoint;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getSomeValue3() {
        return someValue3;
    }

    public void setSomeValue3(String someValue3) {
        this.someValue3 = someValue3;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }
    public void sayName(){
        System.out.println("Меня зовут " + namePerson);
    }
    public int toEat(){
        return setHealthPoint(getHealthPoint() + 10);
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}