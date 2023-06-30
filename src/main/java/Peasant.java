public class Peasant extends FootSoldierHero {
    private int peasantValue;
    private int peasantValue2;
    private String peasantValue3;
    Peasant(int healthPoint, int attack, int defence, String namePerson, int someExtraValue, int someExtraValue2, String someExtraValue3, int peasantValue, int peasantValue2, String peasantValue3) {
        super(healthPoint, attack, defence, namePerson, someExtraValue, someExtraValue2, someExtraValue3);
        this.peasantValue = peasantValue;
        this.peasantValue2 = peasantValue2;
        this.peasantValue3 = peasantValue3;
    }
    Peasant(){
        super(10, 10, 10, "Крестьянин", 10, 10, "");}
    @Override
    public void step(){}
    @Override
    public String getInfo(){
        return getNamePerson();
    }

    public int getPeasantValue() {
        return peasantValue;
    }

    public void setPeasantValue(int peasantValue) {
        this.peasantValue = peasantValue;
    }

    public int getPeasantValue2() {
        return peasantValue2;
    }

    public void setPeasantValue2(int peasantValue2) {
        this.peasantValue2 = peasantValue2;
    }

    public String getPeasantValue3() {
        return peasantValue3;
    }

    public void setPeasantValue3(String peasantValue3) {
        this.peasantValue3 = peasantValue3;
    }
    public void somePeasantAction(int peasantValue){
        System.out.println("Hello world" + peasantValue);
    }
    public String somePeasantAction2(){
        return peasantValue3;
    }
}
