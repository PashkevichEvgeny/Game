public class FootSoldierHero extends BaseHero {
    private int someExtraValue;
    private int someExtraValue2;
    private String someExtraValue3;

    FootSoldierHero(int healthPoint, int attack, int defence, String namePerson, int someExtraValue, int someExtraValue2, String someExtraValue3) {
        super(healthPoint, attack, defence, namePerson);
        this.someExtraValue = someExtraValue;
        this.someExtraValue2 = someExtraValue2;
        this.someExtraValue3 = someExtraValue3;
    }
    @Override
    public String die() {
        return "";
    }
    @Override
    public void step(){}
    @Override
    public String getInfo(){
        return "";
    }

    public int getSomeExtraValue() {
        return someExtraValue;
    }

    public void setSomeExtraValue(int someExtraValue) {
        this.someExtraValue = someExtraValue;
    }

    public int getSomeExtraValue2() {
        return someExtraValue2;
    }

    public void setSomeExtraValue2(int someExtraValue2) {
        this.someExtraValue2 = someExtraValue2;
    }

    public String getSomeExtraValue3() {
        return someExtraValue3;
    }

    public void setSomeExtraValue3(String someExtraValue3) {
        this.someExtraValue3 = someExtraValue3;
    }
    public void someExtraAction(int someExtraValue){
        System.out.println("Hello world" + someExtraValue + someExtraValue2);
    }
    public String someExtraAction2(){
        return getSomeExtraValue3();
    }
}
