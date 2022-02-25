package helloworldmain;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AddressInput extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Test");
        GridPane pane= new GridPane();
        
        ColumnConstraints col20p = new ColumnConstraints(); 
        col20p.setPercentWidth(20);  
        ColumnConstraints col30p = new ColumnConstraints(); 
        col30p.setPercentWidth(30);  
        pane.getColumnConstraints().addAll(col20p, col30p, col30p, col20p);
        
        Label title = new Label("Address Input");
        Button btnSubmit = new Button("Submit");
        Button btnClear = new Button("Clear");
        GridPane.setHalignment(btnSubmit, HPos.CENTER);
        GridPane.setHalignment(btnClear, HPos.CENTER);
        GridPane.setHalignment(title, HPos.CENTER);
        
                
        pane.add(title, 0 , 0, 4, 1);
        pane.add(new Label("Address 1 "), 0 , 1);
        pane.add(new Label("Address 2 "), 0 , 2);
        pane.add(new Label("City "), 0 , 3);
        pane.add(new Label("Province "), 0 , 4);
        pane.add(new Label("Postal "), 2 , 4);
        pane.add(new TextField(), 1 , 1, 3, 1);
        pane.add(new TextField(), 1 , 2, 3, 1);
        pane.add(new TextField(), 1 , 3, 2, 1);
        pane.add(new TextField(), 1 , 4, 1, 1);
        pane.add(new TextField(), 3 , 4, 1, 1);
        pane.add(btnSubmit, 0,5,2,1);
        pane.add(btnClear, 2,5,2,1);
        
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
        
    public static void main(String[] args) {
        launch(args);
    }
    
}
