package helloworldmain;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Grid extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Test");
        GridPane pane= new GridPane();
        pane.setVgap(5);
        pane.setHgap(5);
        
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        btn2.setPrefHeight(70);
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");
        Button btn5 = new Button("Button 5");
        btn5.setPrefWidth(130);
        pane.add(btn1, 0, 0);
        pane.add(btn2, 1, 0, 1, 3);
        pane.add(btn3, 0, 1);
        pane.add(btn4, 0, 2);
        pane.add(btn5, 0, 4, 2, 1);
        
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }   
    public static void main(String[] args) {
        launch(args);
    }
}
