/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package helloworldmain;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TestGrid3 extends Application {
    
     
     public void start(Stage primaryStage) {
        GridPane pane= new GridPane();
        
        ColumnConstraints column = new ColumnConstraints(100);
        pane.getColumnConstraints().add(column);
        

        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");
        Button btn5 = new Button("Button 5");
        
        btn2.setPrefHeight(70);
        btn5.prefWidth(150);
        
        pane.add(btn1, 0, 0);
        pane.add(btn3, 0, 1);
        pane.add(btn4, 0, 2);
        
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
