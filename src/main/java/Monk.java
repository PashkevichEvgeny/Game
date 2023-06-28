public class Monk extends ThirdClass{
    private int monkValue;
    private int monkValue2;
    private String monkValue3;

    Monk(int monkValue, int monkValue2, String monkValue3) {
        this.monkValue = monkValue;
        this.monkValue2 = monkValue2;
        this.monkValue3 = monkValue3;
    }
    public Monk(){

    }

    public int getMonkValue() {
        return monkValue;
    }

    public void setMonkValue(int monkValue) {
        this.monkValue = monkValue;
    }

    public int getMonkValue2() {
        return monkValue2;
    }

    public void setMonkValue2(int monkValue2) {
        this.monkValue2 = monkValue2;
    }

    public String getMonkValue3() {
        return monkValue3;
    }

    public void setMonkValue3(String monkValue3) {
        this.monkValue3 = monkValue3;
    }
    public void someMonkAction(int monkValue){
        System.out.println("Hello World" + monkValue2);
    }
    public String someMonkAction2(){
        return monkValue3;
    }
}
