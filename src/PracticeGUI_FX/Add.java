package PracticeGUI_FX;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.collections.*;
import javafx.geometry.Insets;

public class Add extends Application {
    
    Label lbl1,lbl2,lbl3;
    TextField txt1,txt2,txt3;
    Button btn;
 
    @Override
    public void start(Stage primaryStage) {
        
        GridPane pane = new GridPane();
        lbl1 = new Label("First Number");
        lbl2 = new Label("Second Number");
        lbl3 = new Label("Result");
        btn = new Button("Calculate");
        txt1 = new TextField();
        txt2 = new TextField();
        txt3 = new TextField();
        
        btn.setOnAction( e -> calculate());
        btn.setPrefHeight(20);
        
        pane.add(lbl1, 0, 0);
        pane.add(lbl2, 0, 1);
        pane.add(lbl3, 0, 2);
        pane.add(btn, 1, 3);
        pane.add(txt1, 1, 0);
        pane.add(txt2, 1, 1);
        pane.add(txt3, 1, 2);
        
        pane.setVgap(5);
        pane.setHgap(5);
        
        pane.setPadding(new Insets(20,20,20,20));

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Simple Adding!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public double getFirst() {
        return Double.parseDouble(txt1.getText());
    }

    public double getSecond() {
        return Double.parseDouble(txt2.getText());
    }
    
    public double adding(double x, double y) {
        return x+y;
    }
    
    public void setResult(double z) {
        txt3.setText(""+z);
    }
    
    public void calculate() {
        setResult(adding(getFirst(),getSecond()));
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
