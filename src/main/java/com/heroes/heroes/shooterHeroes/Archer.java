package com.heroes.heroes.shooterHeroes;

import com.heroes.BaseHero;
import com.heroes.heroes.peonHeroes.Peasant;
import com.heroes.heroes.ShooterHero;

import java.util.List;
public class Archer extends ShooterHero {
    public Archer (String namePerson, int x, int y) {
        super(namePerson, 10, 10, 10, 3, x, y);
        this.setInitiate(this.getInitiate() + 1);
    }
    public String getInfo(){
        return super.getInfo() + " стрел:" + amountArrows;
    }
    public String getName(){
        return namePerson;
    }
    @Override
    public void step(List<BaseHero> ourTeam, List<BaseHero> oppositeTeam) {
        if (this.healthPoint <= 0 || this.amountArrows <= 0) return;
        super.step(ourTeam, oppositeTeam);
        for (BaseHero item: ourTeam) {
            if (item instanceof Peasant && item.getHealthPoint() > 0 && ((Peasant) item).readyToSeek) {
                System.out.println("  Батрак неси стрелу");
                ((Peasant) item).readyToSeek = false;
                return;
            }
        }
        amountArrows--;
        System.out.println(" стрел стало:" + amountArrows);
    }
}

