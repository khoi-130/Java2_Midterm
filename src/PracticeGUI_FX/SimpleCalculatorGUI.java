package PracticeGUI_FX;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class SimpleCalculatorGUI extends Application {
    
    Label lblFirst, lblSecond, lblResult;
    TextField txtFirst, txtSecond, txtResult;
    Button btnAdd, btnSub, btnMulti, btnDivide;
    
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        lblFirst = new Label("First Number");
        lblSecond = new Label("Second Number");
        lblResult = new Label("Result");
        txtFirst = new TextField();
        txtSecond = new TextField();
        txtResult = new TextField();
        btnAdd = new Button("Add"); 
        btnSub = new Button("Subtract"); 
        btnMulti = new Button("Multiply"); 
        btnDivide = new Button("Divide"); 
        
        btnAdd.setOnAction(e -> add());
        btnSub.setOnAction(e -> sub());
        btnMulti.setOnAction(e -> multiply());
        btnDivide.setOnAction(e -> divide());

        pane.add(lblFirst, 0, 0);        
        pane.add(lblSecond, 0, 1);
        pane.add(lblResult, 0, 2);
        pane.add(txtFirst, 1, 0);
        pane.add(txtSecond, 1, 1);
        pane.add(txtResult, 1, 2);
        pane.add(btnAdd, 0, 3);
        pane.add(btnSub, 1, 3);
        pane.add(btnMulti, 2, 3);
        pane.add(btnDivide, 3, 3);
        
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    
     public void add() {
        if (isValid()) {
            setResult(getNum1()+getNum2());
        } else {
            System.out.println("Error");
            }
        }
     
    public void sub() {
        if (isValid()) {
            setResult((getNum1()-getNum2()));
        } else {
            System.out.println("Error");
        }
    }
         
    public void multiply() {
        if (isValid()) {
        setResult(getNum1() * getNum2());
        } else {
            System.out.println("Error");
        }
    }
              
    public void divide() {
        if (isValid()) {
        setResult(getNum1()/getNum2());
        } else {
            System.out.println("Error");
        }
    }
    
    public double getNum1() {
        return Double.parseDouble(txtFirst.getText());
    }
      
    public double getNum2() {
        return Double.parseDouble(txtSecond.getText());
    }
    
    public void setResult(double value) {
        txtResult.setText(value + "");
    }
      
    public boolean isNumeric(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch(Exception e) {
            return false;
        }    
    }
      
    public boolean isEmpty(String val) {
        return val.trim().equals("");
    }
    
    public boolean isValid() {
        try {    
            if(isEmpty(txtFirst.getText()) || isEmpty(txtSecond.getText())) {
                System.out.println("Input must have value");
                return false;
            }
            if(!isNumeric(txtFirst.getText()) || !isNumeric(txtSecond.getText())) {
                System.out.println("Input must be a number");
                return false;
            }    
          
        } catch (Exception e) {
            System.out.println("Error calculating");
        }
        return true;
        
    }
    
    public static void main(String[] args ) {
        launch(args);
    }
}
