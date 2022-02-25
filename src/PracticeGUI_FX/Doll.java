package PracticeGUI_FX;

public class Doll extends Toy {
    private String dressColor;
    private String hairColor;

    public Doll(String dressColor, String hairColor, String name, double price) {
        super(name, price);
        this.dressColor = dressColor;
        this.hairColor = hairColor;
    }

    public String getDressColor() {
        return dressColor;
    }

    public void setDressColor(String dressColor) {
        this.dressColor = dressColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    
    
}
