public class FirstClass extends BaseClass{
    private int someExtraValue;
    private int someExtraValue2;
    private String someExtraValue3;

    private FirstClass(int someExtraValue, int someExtraValue2, String someExtraValue3) {
        super();
        this.someExtraValue = someExtraValue;
        this.someExtraValue2 = someExtraValue2;
        this.someExtraValue3 = someExtraValue3;
    }
    public FirstClass(){
    }

    @Override
    public void die() {

    }

    public int getSomeExtraValue() {
        return someExtraValue;
    }

    public void setSomeExtraValue(int someExtraValue) {
        this.someExtraValue = someExtraValue;
    }

    public int getSomeExtraValue2() {
        return someExtraValue2;
    }

    public void setSomeExtraValue2(int someExtraValue2) {
        this.someExtraValue2 = someExtraValue2;
    }

    public String getSomeExtraValue3() {
        return someExtraValue3;
    }

    public void setSomeExtraValue3(String someExtraValue3) {
        this.someExtraValue3 = someExtraValue3;
    }
    public void someExtraAction(int someExtraValue){
        System.out.println("Hello world" + someExtraValue + someExtraValue2);
    }
    public String someExtraAction2(){
        return getSomeExtraValue3();
    }
}
