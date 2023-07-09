package com.heroes.heroes.shooterHeroes;

import com.heroes.BaseHero;
import com.heroes.heroes.ShooterHero;

import java.util.List;
public class Crossbowman extends ShooterHero {
    public Crossbowman(String namePerson, int x, int y) {
        super(namePerson, 10, 10, 10, 3, x, y);
        this.setInitiate(this.getInitiate() + 2);
    }
    public String getInfo(){
        return super.getInfo();
    }
    public String getName(){
        return namePerson;
    }
    public void step(List<BaseHero> ourTeam, List<BaseHero> oppositeTeam) {
        super.step(ourTeam, oppositeTeam);
    }
}
