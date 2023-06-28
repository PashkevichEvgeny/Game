public class Sorcerer extends ThirdClass{
    private int sorcererValue;
    private int sorcererValue2;
    private String sorcererValue3;

    Sorcerer(int sorcererValue, int sorcererValue2, String sorcererValue3) {
        this.sorcererValue = sorcererValue;
        this.sorcererValue2 = sorcererValue2;
        this.sorcererValue3 = sorcererValue3;
    }
    public Sorcerer(){
    }

    @Override
    public void die() {

    }

    public int getSorcererValue() {
        return sorcererValue;
    }

    public void setSorcererValue(int sorcererValue) {
        this.sorcererValue = sorcererValue;
    }

    public int getSorcererValue2() {
        return sorcererValue2;
    }

    public void setSorcererValue2(int sorcererValue2) {
        this.sorcererValue2 = sorcererValue2;
    }

    public String getSorcererValue3() {
        return sorcererValue3;
    }

    public void setSorcererValue3(String sorcererValue3) {
        this.sorcererValue3 = sorcererValue3;
    }

    public boolean someSorcererAction(int sorcererValue){
        System.out.println("Hello world" + " " + sorcererValue);
        return false;
    }
    public String someSorcererAction2(){
        return sorcererValue3;
    }
}
