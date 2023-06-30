public class ShooterHero extends BaseHero {
    private int extraDamage = 10;
    private String nameOfCategory = "Бойевик";

    ShooterHero(int healthPoint, int damage, int defence, String namePerson, int extraDamage, String nameOfCategory) {
        super(healthPoint, damage, defence, namePerson);
        this.extraDamage = extraDamage;
        this.nameOfCategory = nameOfCategory;
    }
    public void setDamage(int damage) {
        super.setDamage(damage);
    }

    @Override
    public String die() {
        return "-".repeat(this.getHealthPoint());
    }
    @Override
    public void step(){}
    @Override
    public String getInfo(){
        return nameOfCategory;
    }

    public int getExtraDamage() {
        return extraDamage;
    }

    public void setExtraDamage(int extraDamage) {
        this.extraDamage = extraDamage;
    }
}