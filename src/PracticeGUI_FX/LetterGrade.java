package PracticeGUI_FX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LetterGrade extends Application  {
    
    Label lbl1, lbl2, lbl3;     
    Button btn1;
    TextField txt1, txt2;
    
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        
        lbl1 = new Label("Mark");
        lbl1.setStyle("-fx-font-weight: bold");
        lbl2 = new Label("Total");
        lbl2.setStyle("-fx-font-weight: bold");
        lbl3 = new Label("");
        txt1 = new TextField("");
        txt2 = new TextField("");
        
        btn1 = new Button("Letter Gtade");
        
        pane.add(lbl1, 0,0);
        pane.add(lbl2, 0,1);
        pane.add(btn1, 0,3);
        pane.add(txt1, 1,0);
        pane.add(txt2, 1,1);
        pane.add(lbl3, 1,3);
        
        btn1.setOnAction( e -> calculate());
        
        Scene scene = new Scene(pane);        
        primaryStage.setTitle("Letter Grade");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public double getMark() {
        return Double.parseDouble(txt1.getText());
    }

    public double getTotal() {
        return Double.parseDouble(txt2.getText());
    }
    
    public double calcLetter(double a, double b) {
        return 100 * (a / b);
    }
    
    public void calculate() {
        setLetter(calcLetter(getMark(),getTotal()));
    }
    
    public void setLetter(double a) {
        String grade;
        if (a < 50) {
            grade = "F";
        } else if ( a >= 50 && a <= 59) {
            grade = "D";
        } else if ( a >= 60 && a <= 69) {
            grade = "C";
        } else if ( a >= 70 && a <= 79) {
            grade = "B";
        } else {
            grade = "A";
        }
        lbl3.setText(grade +"");
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
