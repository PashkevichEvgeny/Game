public class Sniper extends SecondClass{
    private int sniperValue;
    private int sniperValue2;
    private String sniperValue3;

    Sniper(int sniperValue, int sniperValue2, String sniperValue3) {
        this.sniperValue = sniperValue;
        this.sniperValue2 = sniperValue2;
        this.sniperValue3 = sniperValue3;
    }
    public Sniper(){

    }

    public int getSniperValue() {
        return sniperValue;
    }

    public void setSniperValue(int sniperValue) {
        this.sniperValue = sniperValue;
    }

    public int getSniperValue2() {
        return sniperValue2;
    }

    public void setSniperValue2(int sniperValue2) {
        this.sniperValue2 = sniperValue2;
    }

    public String getSniperValue3() {
        return sniperValue3;
    }

    public void setSniperValue3(String sniperValue3) {
        this.sniperValue3 = sniperValue3;
    }

    public void someSniperAction(int sniperValue){
        System.out.println("Hello world" + sniperValue);
    }
    public String someSniperAction2(){
        return sniperValue3;
    }
}
