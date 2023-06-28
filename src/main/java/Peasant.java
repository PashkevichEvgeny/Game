public class Peasant extends FirstClass{
    private int peasantValue;
    private int peasantValue2;
    private String peasantValue3;

    Peasant(int peasantValue, int peasantValue2, String peasantValue3) {
        this.peasantValue = peasantValue;
        this.peasantValue2 = peasantValue2;
        this.peasantValue3 = peasantValue3;
    }
    public Peasant(){
    }

    public int getPeasantValue() {
        return peasantValue;
    }

    public void setPeasantValue(int peasantValue) {
        this.peasantValue = peasantValue;
    }

    public int getPeasantValue2() {
        return peasantValue2;
    }

    public void setPeasantValue2(int peasantValue2) {
        this.peasantValue2 = peasantValue2;
    }

    public String getPeasantValue3() {
        return peasantValue3;
    }

    public void setPeasantValue3(String peasantValue3) {
        this.peasantValue3 = peasantValue3;
    }
    public void somePeasantAction(int peasantValue){
        System.out.println("Hello world" + peasantValue);
    }
    public String somePeasantAction2(){
        return peasantValue3;
    }
}
