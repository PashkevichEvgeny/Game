package com.heroes.heroes.magicianHeroes;

import com.heroes.BaseHero;
import com.heroes.heroes.MagicianHero;

import java.util.List;
public class Sorcerer extends MagicianHero {
    public Sorcerer(String namePerson, int x, int y) {
        super(namePerson, 10, 10, 10, x, y);
        this.setInitiate(this.getInitiate() + 1);
    }
    @Override
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
