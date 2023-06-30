public class Monk extends MagicianHero {
    private int monkValue;
    private int monkValue2;
    private String monkValue3;

    Monk(int healthPoint, int attack, int defence, String namePerson, int someExtraValue, int someExtraValue2, String someExtraValue3, int monkValue, int monkValue2, String monkValue3) {
        super(healthPoint, attack, defence, namePerson, someExtraValue, someExtraValue2, someExtraValue3);
        this.monkValue = monkValue;
        this.monkValue2 = monkValue2;
        this.monkValue3 = monkValue3;
    }

    public Monk() {
        super(10, 10, 10, "Монах", 10, 10, "");
    }

    @Override
    public void step(){}
    @Override
    public String getInfo(){
        return getNamePerson();
    }

    public int getMonkValue() {
        return monkValue;
    }

    public void setMonkValue(int monkValue) {
        this.monkValue = monkValue;
    }

    public int getMonkValue2() {
        return monkValue2;
    }

    public void setMonkValue2(int monkValue2) {
        this.monkValue2 = monkValue2;
    }

    public String getMonkValue3() {
        return monkValue3;
    }

    public void setMonkValue3(String monkValue3) {
        this.monkValue3 = monkValue3;
    }
    public void someMonkAction(int monkValue){
        System.out.println("Hello World" + monkValue2);
    }
    public String someMonkAction2(){
        return monkValue3;
    }
}
