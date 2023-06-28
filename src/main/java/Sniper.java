public class Sniper extends SecondClass{
    private int sniperValue;
    private int sniperValue2;
    private String nameOfProfession = "Снайпер";

    Sniper(int sniperValue, int sniperValue2, String nameOfProfession) {
        this.sniperValue = sniperValue;
        this.sniperValue2 = sniperValue2;
        this.nameOfProfession = nameOfProfession;
    }
    public Sniper(){
        super();
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

    public String getNameOfProfession() {
        return nameOfProfession;
    }

    public void setNameOfProfession(String nameOfProfession) {
        this.nameOfProfession = nameOfProfession;
    }

    public void sayProfession(){
        System.out.println("Моя работа " + nameOfProfession);
    }
    public String someSniperAction2(){
        return nameOfProfession;
    }
}
