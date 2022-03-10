package PracticeGUI_FX;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class CircleObjectGUI extends Application {
    
    TextField txt1,txt2;
    Button btn1;
    Label lbl1,lbl2;
    
    public void start(Stage primaryStage) {
        try {
        GridPane pane = new GridPane();
        btn1 = new Button("go");
        lbl1 = new Label("Radius");
        lbl2 = new Label("Area");
        txt1 = new TextField("");
        txt2 = new TextField("");
        
        pane.add(lbl1, 0, 0);        
        pane.add(lbl2, 0, 1);
        pane.add(txt1, 1, 0);
        pane.add(txt2, 1, 1);
        pane.add(btn1, 0, 2);
 
        btn1.setOnAction(e -> go());
        
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
        } catch(Exception e) {
            System.out.println("Error occured: " + e);
        }
        }

    public void go() {
        try {
            
            if(isEmpty(txt1.getText())) {
                showAlert("Radius must have value");
            } else if (!isNumeric(txt1.getText())) {
                showAlert("Radius must have a number");
            } else {
                CircleGUI circle = new CircleGUI();
                circle.setRadius(getRadius());
                setArea(circle.getArea());
            }
          
        } catch (Exception e) {
            showAlert("Error calculating area");
        }
        
    }
    
    public double getRadius() {
//        try {
        return Double.parseDouble(txt1.getText());
//        } catch (Exception e) {
//            System.out.println("Your input is invalid");
//        }
//        return 0;
    }
    
    public void setArea(double value) {
        txt2.setText(value + "");
    }
    
    public boolean isEmpty(String val) {
        return val.trim().equals("");
    }
    
    public boolean isNumeric(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch(Exception e) {
            return false;
        }    
    }
    
    public void showAlert(String msg) {
        Alert a  = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Calculator warning");
        a.setHeaderText("Invalid input");
        a.setContentText(msg);
        a.show();
    }
    
    public static void main(String[] args ) {
        launch(args);
    }
    
}
