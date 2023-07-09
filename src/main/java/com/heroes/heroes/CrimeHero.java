package com.heroes.heroes;

import com.heroes.BaseHero;

import java.util.List;
public class CrimeHero extends BaseHero {
    public CrimeHero(String namePerson, int healthPoint, int defense, int damage, int x, int y) {
        super(namePerson, healthPoint, defense, damage, 5, x, y);
    }
    public String getName(){ return namePerson; }
    public String getInfo(){ return super.getInfo(); }
    public void step(List<BaseHero> ourTeam, List<BaseHero> oppositeTeam) {
        super.step(ourTeam, oppositeTeam);
    }
}