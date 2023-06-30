public class Crossbowman extends ShooterHero {
    private int crossbowmanValue;
    private int crossbowmanValue2;
    private String typePersons;

    Crossbowman(int healthPoint, int attack, int defence, String namePerson, int someExtraValue, int someExtraValue2, String nameOfCategory, int crossbowmanValue, int crossbowmanValue2, String typePersons) {
        super(healthPoint, attack, defence, namePerson, someExtraValue, nameOfCategory);
        this.crossbowmanValue = crossbowmanValue;
        this.crossbowmanValue2 = crossbowmanValue2;
        this.typePersons = typePersons;
    }

    public Crossbowman() {
        super(50,10,10,"Арбалетчик",55,"Стрелец");
        setDamage(getDamage() + getExtraDamage());
    }
    @Override
    public void step(){}
    @Override
    public String getInfo(){
        return getNamePerson();
    }

}
