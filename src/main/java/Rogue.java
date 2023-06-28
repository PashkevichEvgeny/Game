public class Rogue extends FirstClass{
    private int rougeValue;
    private int rougeValue2;
    private String rougeValue3;

    private Rogue(int rougeValue, int rougeValue2, String rougeValue3) {
        this.rougeValue = rougeValue;
        this.rougeValue2 = rougeValue2;
        this.rougeValue3 = rougeValue3;
    }
    public Rogue(){

    }

    public int getRougeValue() {
        return rougeValue;
    }

    public void setRougeValue(int rougeValue) {
        this.rougeValue = rougeValue;
    }

    public int getRougeValue2() {
        return rougeValue2;
    }

    public void setRougeValue2(int rougeValue2) {
        this.rougeValue2 = rougeValue2;
    }

    public String getRougeValue3() {
        return rougeValue3;
    }

    public void setRougeValue3(String rougeValue3) {
        this.rougeValue3 = rougeValue3;
    }

    public void someRougeAction(int rougeValue){
        System.out.println("Hello world" + rougeValue);
    }
    public String someRougeAction2(){
        return rougeValue3;
    }
}
