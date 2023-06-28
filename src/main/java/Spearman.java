public class Spearman extends SecondClass{
    private int spearmanValue;
    private int spearmanValue2;
    private String spearmanValue3;

    Spearman(int spearmanValue, int spearmanValue2, String spearmanValue3) {
        this.spearmanValue = spearmanValue;
        this.spearmanValue2 = spearmanValue2;
        this.spearmanValue3 = spearmanValue3;
    }
    public Spearman(){

    }

    public int getSpearmanValue() {
        return spearmanValue;
    }

    public boolean setSpearmanValue(int spearmanValue) {
        this.spearmanValue = spearmanValue;
        return false;
    }

    public int getSpearmanValue2() {
        return spearmanValue2;
    }

    public void setSpearmanValue2(int spearmanValue2) {
        this.spearmanValue2 = spearmanValue2;
    }

    public String getSpearmanValue3() {
        return spearmanValue3;
    }

    public void setSpearmanValue3(String spearmanValue3) {
        this.spearmanValue3 = spearmanValue3;
    }
    public void someSpearmanAction(int spearmanValue){
        System.out.println("Hello world" + spearmanValue);
    }
    public String someSpearmanAction(){
        return spearmanValue3;
    }
}
