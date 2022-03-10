package PracticeGUI_FX;

public class CircleGUI {

    private double radius;
    
    public double getArea() {
        return Math.round(Math.PI * radius * radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "CircleGUI{" + "radius=" + radius + '}';
    }
    
    
    
}
