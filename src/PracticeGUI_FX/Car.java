package PracticeGUI_FX;

public class Car extends Toy {
    
    private String color;
    private int speed;

    public Car(String color, int speed, String name, double price) {
        super(name, price);
        this.color = color;
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    
}
