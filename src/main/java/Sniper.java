public class Sniper extends ShooterHero {
    private int sniperValue;
    private int sniperValue2;
    private String nameOfProfession = "Снайпер";

    Sniper(int healthPoint, int damage, int defence, String namePerson, int someExtraValue, int someExtraValue2, String nameOfCategory, int sniperValue, int sniperValue2, String nameOfProfession) {
        super(healthPoint, damage, defence, namePerson, someExtraValue, nameOfCategory);
        this.sniperValue = sniperValue;
        this.sniperValue2 = sniperValue2;
        this.nameOfProfession = nameOfProfession;
    }
    Sniper(){
        super(50, 10, 10 , "Стрелок", 10, "Стрелец");
        setDamage(getDamage() + getExtraDamage());
    }
    @Override
    public void step(){}
    @Override
    public String getInfo(){
        return getNamePerson();
    }

    public int getSniperValue() {
        return sniperValue;
    }

    public void setSniperValue(int sniperValue) {
        this.sniperValue = sniperValue;
    }

    public int getSniperValue2() {
        return sniperValue2;
    }

    public void setSniperValue2(int sniperValue2) {
        this.sniperValue2 = sniperValue2;
    }

    public String getNameOfProfession() {
        return nameOfProfession;
    }

    public void setNameOfProfession(String nameOfProfession) {
        this.nameOfProfession = nameOfProfession;
    }

    public void sayProfession(){
        System.out.println("Моя работа " + nameOfProfession);
    }
    public String someSniperAction2(){
        return nameOfProfession;
    }
}
