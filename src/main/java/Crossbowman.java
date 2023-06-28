public class Crossbowman {
    private int crossbowmanValue;
    private int crossbowmanValue2;
    private String crossbowmanValue3;

    Crossbowman(int crossbowmanValue, int crossbowmanValue2, String crossbowmanValue3) {
        this.crossbowmanValue = crossbowmanValue;
        this.crossbowmanValue2 = crossbowmanValue2;
        this.crossbowmanValue3 = crossbowmanValue3;
    }
    public Crossbowman(){
    }

    public int getCrossbowmanValue() {
        return crossbowmanValue;
    }

    public void setCrossbowmanValue(int crossbowmanValue) {
        this.crossbowmanValue = crossbowmanValue;
    }

    public int getCrossbowmanValue2() {
        return crossbowmanValue2;
    }

    public void setCrossbowmanValue2(int crossbowmanValue2) {
        this.crossbowmanValue2 = crossbowmanValue2;
    }

    public String getCrossbowmanValue3() {
        return crossbowmanValue3;
    }

    public void setCrossbowmanValue3(String crossbowmanValue3) {
        this.crossbowmanValue3 = crossbowmanValue3;
    }
    public void someCrossbowmanAction(int crossbowmanValue){
        System.out.println("Hello world" + crossbowmanValue2);
    }
    public String someCrossbowmanAction(){
        return crossbowmanValue3;
    }
}
