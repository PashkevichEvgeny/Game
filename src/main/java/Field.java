public class Field {
    public int x;
    public int y;

    public Field(int x, int y) {
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
        return new int[]{ x, y};
    }
}
