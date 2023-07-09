package com.heroes;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Arena {
    public int x;
    public int y;

    public Arena(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int[] getCoord(){
        return new int[]{x, y};
    }
    public double distance(int[] player1, int[] player2){
        return sqrt(pow(player2[0] - player1[0], 2) + pow(player2[1] - player1[1], 2));
    }
}
