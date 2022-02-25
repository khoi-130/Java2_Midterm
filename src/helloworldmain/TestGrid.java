package helloworldmain;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TestGrid extends Application {
    
     @Override
     public void start(Stage primaryStage) {
        GridPane pane= new GridPane();

        pane.add(new Button("Button 1"), 0, 0);
        pane.add(new Button("Button 1"), 2, 0);
        pane.add(new Button("Button 3"), 1, 1);
        pane.add(new Button("Button 4"), 0, 2);
        pane.add(new Button("Button 5"), 2, 2);
        
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
