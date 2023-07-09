package com.heroes.heroes.crimeHeroes;

import com.heroes.BaseHero;
import com.heroes.heroes.CrimeHero;

import java.util.List;
public class Robber extends CrimeHero {
    public Robber(String namePerson, int x, int y){
        super(namePerson, 10, 10, 10, x, y);
        this.setInitiate(this.getInitiate() + 1);
    }
    public String getInfo(){ return super.getInfo(); }
    public String getName(){ return namePerson; }
    public void step(List<BaseHero> ourTeam, List<BaseHero> oppositeTeam) {
        super.step(ourTeam, oppositeTeam);
    }
}
