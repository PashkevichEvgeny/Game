public class SecondClass extends BaseClass{
    private int someExtraValue;
    private int someExtraValue2;
    private String nameOfCategory = "Бойевик";

    public SecondClass() {
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

    public String getNameOfCategory() {
        return nameOfCategory;
    }

    public void setNameOfCategory(String nameOfCategory) {
        this.nameOfCategory = nameOfCategory;
    }
    public void sayCategory(){
        System.out.println("Моя сфера деятельности " + nameOfCategory);
    }
    public String someExtraAction2(){
        return getNameOfCategory();
    }
}