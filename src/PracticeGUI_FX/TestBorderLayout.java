package PracticeGUI_FX;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.collections.*;


public class TestBorderLayout extends Application{
    
    public void start(Stage primaryStage){
       BorderPane pane = new BorderPane();
       
       Button btnClear = new Button("Clear");
       TextArea taBoard = new TextArea();
       
       pane.setTop(btnClear);
       pane.setCenter(taBoard);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
        
    public static void main(String[] args){
        launch(args);
    }
}
