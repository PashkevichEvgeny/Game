package com.heroes.heroes;

import com.heroes.BaseHero;

import java.util.List;
public class ShooterHero extends BaseHero {
    protected int amountArrows;
    public ShooterHero(String namePerson, int healthPoint, int defense, int damage, int amountArrows, int x, int y) {
        super(namePerson, healthPoint, defense, damage, 20, x, y);
        this.amountArrows = amountArrows;
    }
    public String getName(){
        return namePerson;
    }
    public String getInfo(){
        return super.getInfo();
    }
    public void step(List<BaseHero> ourTeam, List<BaseHero> oppositeTeam) {
        super.step(ourTeam, oppositeTeam);
    }
}
