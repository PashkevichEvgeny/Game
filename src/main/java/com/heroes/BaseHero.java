package com.heroes;

import java.util.List;

public abstract class BaseHero implements GameInterface {
    protected String namePerson;
    protected int healthPoint;
    protected int defense;
    protected int damage;
    private int initiate;
    private Arena position;
    public BaseHero(String namePerson, int healthPoint, int defense, int damage, int initiate, int x, int y) {
        this.namePerson = namePerson;
        this.healthPoint = healthPoint;
        this.defense = defense;
        this.damage = damage;
        this.setInitiate(initiate);
        this.setPosition(new Arena(x, y));
    }
    public String getName() {
        return namePerson;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public String getInfo(){
        return String.format("%s ин:%2d хп:%2d",
                namePerson, getInitiate(), healthPoint);
    }

    @Override
    public void step(List<BaseHero> ourTeam, List<BaseHero> oppositeTeam) {
        BaseHero victim = lookForEnemy(oppositeTeam);
        System.out.printf("%s вижу в %.2f метрах от меня %s=> хп:",
                getInfo(),
                position.distance(getPosition(), victim.getPosition()),
                victim.getInfo());
        if (getHealthPoint() > 0) doDamage(victim);
        System.out.println(victim.healthPoint);
    }
    public int[] getPosition() {
        return position.getCoord();
    }
    public void setPosition(Arena position) {
        this.position = position;
    }
    public BaseHero lookForEnemy(List<BaseHero> oppositeTeam) {
        double dis;
        BaseHero enemy = oppositeTeam.get(0);
        double nearestDistance = position.distance(getPosition(), enemy.getPosition());
        for (BaseHero enemyItem : oppositeTeam) {
            dis = position.distance(getPosition(), enemyItem.getPosition());
            if (dis < nearestDistance && enemyItem.healthPoint > 0) {
                nearestDistance = dis;
                enemy = enemyItem;
            }
        }
        return enemy;
    }
    public void doDamage(BaseHero victim){
        if (damage > victim.defense) {
            victim.healthPoint -= damage;
        } else {
            System.out.print("Не пробил ");
    }
    }

    public int getInitiate() {
        return initiate;
    }
    public void setInitiate(int initiate) {
        this.initiate = initiate;
    }
}