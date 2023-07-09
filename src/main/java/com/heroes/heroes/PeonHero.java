package com.heroes.heroes;

import com.heroes.BaseHero;

import java.util.List;
public class PeonHero extends BaseHero {
    public PeonHero(String namePerson, int healthPoint, int defense, int damage, int x, int y) {
        super(namePerson, healthPoint, defense, damage, 0, x, y);
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
