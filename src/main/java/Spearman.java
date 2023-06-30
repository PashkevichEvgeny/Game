public class Spearman extends FootSoldierHero {
    private int spearmanValue2;
    private String spearmanValue3;

    public Spearman(int healthPoint, int attack, int defence, String namePerson, int someExtraValue, int someExtraValue2, String someExtraValue3, int spearmanValue2, String spearmanValue3) {
        super(healthPoint, attack, defence, namePerson, someExtraValue, someExtraValue2, someExtraValue3);
        this.spearmanValue2 = spearmanValue2;
        this.spearmanValue3 = spearmanValue3;
    }

    Spearman(){
        super(10, 10, 10, "Копейщик", 10, 10, "");}
    @Override
    public void step(){}
    @Override
    public String getInfo(){
        return getNamePerson();
    }

    public boolean setSpearmanValue(int spearmanValue) {
        return false;
    }

    public int getSpearmanValue2() {
        return spearmanValue2;
    }

    public void setSpearmanValue2(int spearmanValue2) {
        this.spearmanValue2 = spearmanValue2;
    }

    public String getSpearmanValue3() {
        return spearmanValue3;
    }

    public void setSpearmanValue3(String spearmanValue3) {
        this.spearmanValue3 = spearmanValue3;
    }
    public void someSpearmanAction(int spearmanValue){
        System.out.println("Hello world" + spearmanValue);
    }
    public String someSpearmanAction(){
        return spearmanValue3;
    }
}
