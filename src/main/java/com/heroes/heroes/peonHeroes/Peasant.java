package com.heroes.heroes.peonHeroes;

import com.heroes.BaseHero;
import com.heroes.heroes.PeonHero;

import java.util.List;

public class Peasant extends PeonHero {
    public boolean readyToSeek;
    public Peasant(String namePerson, int x, int y) {
        super(namePerson, 10, 1, 0, x, y);
        this.setInitiate(this.getInitiate() + 1);
        this.readyToSeek = true;
    }
    public String getInfo(){
        return super.getInfo();
    }
    public String getName(){
        return namePerson;
    }
    public void step(List<BaseHero> ourTeam, List<BaseHero> oppositeTeam) {
        super.step(ourTeam, oppositeTeam);
        if (healthPoint > 0 && !this.readyToSeek){
            System.out.println("  Вот ваша стрела, господин Лучник!");
            this.readyToSeek = true;
        }
    }
}
