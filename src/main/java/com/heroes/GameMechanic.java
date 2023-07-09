package com.heroes;

import com.heroes.heroes.crimeHeroes.Robber;
import com.heroes.heroes.infantryHeroes.Spearman;
import com.heroes.heroes.magicianHeroes.Monk;
import com.heroes.heroes.magicianHeroes.Sorcerer;
import com.heroes.heroes.peonHeroes.Peasant;
import com.heroes.heroes.shooterHeroes.Archer;
import com.heroes.heroes.shooterHeroes.Crossbowman;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameMechanic {
    public static List<BaseHero> fillTeam(boolean side){
        int commandSize = 10;
        List<BaseHero> team = new ArrayList<>();
        for (int i = 0; i < commandSize; i++) {
            int coordX = 1, coordY = i + 1;
            if (side) coordX = 10;
            String prefix = ((side)?"A":"B") + i;
            int cnt = new Random().nextInt(7);
            switch (cnt) {
                case 0 -> team.add(new Peasant("Батрак" + prefix, coordX, coordY));
                case 1 -> team.add(new Robber("Разбой" + prefix, coordX, coordY));
                case 2 -> team.add(new Sorcerer("Колдуй" + prefix, coordX, coordY));
                case 3 -> team.add(new Monk("Монахь" + prefix, coordX, coordY));
                case 4 -> team.add(new Spearman("Копейщ" + prefix, coordX, coordY));
                case 5 -> team.add(new Crossbowman("Арбале" + prefix, coordX, coordY));
                case 6 -> team.add(new Archer("Лучник" + prefix, coordX, coordY));
            }
        }
        return team;
    }
}
