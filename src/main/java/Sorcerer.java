public class Sorcerer extends MagicianHero {
    private int sorcererValue;
    private int sorcererValue2;
    private String sorcererValue3;

    Sorcerer(int healthPoint, int attack, int defence, String namePerson, int someExtraValue, int someExtraValue2, String someExtraValue3, int sorcererValue, int sorcererValue2, String sorcererValue3) {
        super(healthPoint, attack, defence, namePerson, someExtraValue, someExtraValue2, someExtraValue3);
        this.sorcererValue = sorcererValue;
        this.sorcererValue2 = sorcererValue2;
        this.sorcererValue3 = sorcererValue3;
    }
    Sorcerer(){super(10, 10, 10, "Маг", 10, 10, "");}
    @Override
    public void step(){}
    @Override
    public String getInfo(){
        return getNamePerson();
    }

    public int getSorcererValue() {
        return sorcererValue;
    }

    public void setSorcererValue(int sorcererValue) {
        this.sorcererValue = sorcererValue;
    }

    public int getSorcererValue2() {
        return sorcererValue2;
    }

    public void setSorcererValue2(int sorcererValue2) {
        this.sorcererValue2 = sorcererValue2;
    }

    public String getSorcererValue3() {
        return sorcererValue3;
    }

    public void setSorcererValue3(String sorcererValue3) {
        this.sorcererValue3 = sorcererValue3;
    }

    public boolean someSorcererAction(int sorcererValue){
        System.out.println("Hello world" + " " + sorcererValue);
        return false;
    }
    public String someSorcererAction2(){
        return sorcererValue3;
    }
}
