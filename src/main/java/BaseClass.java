public abstract class BaseClass{
    private int someValue1;
    private int someValue2;
    private String someValue3;
    private String someValue4;

    private BaseClass(int someValue1, int someValue2, String someValue3, String someValue4) {
        this.someValue1 = someValue1;
        this.someValue2 = someValue2;
        this.someValue3 = someValue3;
        this.someValue4 = someValue4;
    }
    public BaseClass(){
    }

    public int getSomeValue1() {
        return someValue1;
    }

    public void setSomeValue1(int someValue1) {
        this.someValue1 = someValue1;
    }

    public int getSomeValue2() {
        return someValue2;
    }

    public void setSomeValue2(int someValue2) {
        this.someValue2 = someValue2;
    }

    public String getSomeValue3() {
        return someValue3;
    }

    public void setSomeValue3(String someValue3) {
        this.someValue3 = someValue3;
    }

    public String getSomeValue4() {
        return someValue4;
    }

    public void setSomeValue4(String someValue4) {
        this.someValue4 = someValue4;
    }
    public void someAction(int someValue1){
        System.out.println("Hello world" + someValue1 + someValue2);
    }
    public String someAction2(){
        return someValue3;
    }
}