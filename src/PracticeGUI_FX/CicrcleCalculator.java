package PracticeGUI_FX;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class CicrcleCalculator extends Application {
    
    Label lblRadius, lblArea, lblCircumference;
    TextField txtRadius, txtArea, txtCircumference;
    Button btnCalculate;
    
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        lblRadius = new Label("Radius");
        lblArea = new Label("Area");
        lblCircumference = new Label("Circumference");
        txtRadius = new TextField();
        txtArea = new TextField();
        txtCircumference = new TextField();
        btnCalculate = new Button("Caculate"); 
        
        btnCalculate.setOnAction(e -> calculate());

        pane.add(lblRadius, 0, 0);        
        pane.add(lblCircumference, 0, 1);
        pane.add(lblArea, 0, 2);
        pane.add(txtRadius, 1, 0);
        pane.add(txtCircumference, 1, 1);
        pane.add(txtArea, 1, 2);
        pane.add(btnCalculate, 0, 3);
        
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    public double calculateCircumference(double radius) {
        return Math.PI * 2 * radius;
    }
    
    public void calculate() {
        double radius = getRadius();
        setArea(calculateArea(radius));
        setCircumference(calculateCircumference(radius));
    }
    
    public double getRadius() {
        return Double.parseDouble(txtRadius.getText());
    }
    
    public void setArea(double value) {
        txtArea.setText(value + "");
    }
    
    public void setCircumference(double value) {
        txtCircumference.setText(value+ "");
    }
    
    public static void main(String[] args ) {
        launch(args);
    }
    
}
