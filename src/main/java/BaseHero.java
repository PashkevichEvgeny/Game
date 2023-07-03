import java.util.List;

public abstract class BaseHero implements GameInterface {
    public String namePerson;
    private Field fields;

    public BaseHero(String namePerson, int x, int y) {
        this.namePerson = namePerson;
        this.setFields(new Field(x, y));
    }
    public String getName(){
        return namePerson;
    }
    public void step() {
    }
    public Field getFields() {
        return fields;
    }
    public void setFields(Field fields) {
        this.fields = fields;
    }
}