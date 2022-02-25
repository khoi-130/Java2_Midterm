package helloworldmain;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class Border extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Test");
        BorderPane pane= new BorderPane();
        
        Button btnClear = new  Button("Clear");
        TextArea taBoard = new TextArea();
        pane.setTop(btnClear);
        pane.setCenter(taBoard);
        
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
