package PracticeGUI_FX;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Rectangle extends Application  {
    
    Label lbl1, lbl2, lbl3, lbl4;     
    Button btn1;
    TextField txt1, txt2, txt3, txt4;
    
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        
        lbl1 = new Label("Length");
        lbl2 = new Label("Width");
        lbl3 = new Label("Area");
        lbl4 = new Label("Circumference");
         
        txt1 = new TextField("");
        txt2 = new TextField("");
        txt3 = new TextField("");
        txt4 = new TextField("");
        
        btn1 = new Button("Calculate");
        
        pane.add(lbl1, 0,0);
        pane.add(lbl2, 0,1);
        pane.add(lbl3, 0,2);
        pane.add(lbl4, 0,3);
        pane.add(btn1, 0,4);
        pane.add(txt1, 1,0);
        pane.add(txt2, 1,1);
        pane.add(txt3, 1,2);
        pane.add(txt4, 1,3);
        
        pane.setVgap(15);
        pane.setHgap(15);
        
        btn1.setOnAction( e -> calculate());
        
        Scene scene = new Scene(pane);        
        primaryStage.setTitle("Calculating Rectangle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public double getLength() {
        return Double.parseDouble(txt1.getText());
    }
    
    public double getWidth() {
        return Double.parseDouble(txt2.getText());
    }
    
    public double calcArea(double x,double y) {
        return (x+y)*2;
    }
    
    public double calcCircum(double x, double y) {
        return x*y;
    }
    
    public void setArea(double values) {
        txt3.setText(values + "");
    }
    
    public void setCircum(double values) {
        txt4.setText(values + "");
    }
    
    public void calculate() {
        setArea(calcArea(getLength(),getWidth()));
        setCircum(calcCircum(getLength(),getWidth()));
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
