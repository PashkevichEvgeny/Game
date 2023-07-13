package game.model;

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
    public void setCoord(int[] getCoord){
        this.x = getCoord()[0];
        this.y = getCoord()[1];
    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Arena coordPlayer1, Arena coordPlayer2){
        return sqrt(pow(coordPlayer2.x - coordPlayer1.x, 2) + pow(coordPlayer2.y - coordPlayer1.y, 2));
    }
}
