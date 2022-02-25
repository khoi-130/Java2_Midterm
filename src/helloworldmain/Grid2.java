package helloworldmain;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Grid2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       primaryStage.setTitle("Test");
        GridPane pane= new GridPane();
        pane.setVgap(5);
        pane.setHgap(5);
        
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");
        Button btn5 = new Button("Button 5");
        pane.add(btn1, 0, 0);
        pane.add(btn2, 2, 0);
        pane.add(btn3, 1, 1);
        pane.add(btn4, 0, 2);
        pane.add(btn5, 2, 2);
        
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
