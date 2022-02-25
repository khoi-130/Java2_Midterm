package helloworldmain;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Tile extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Test");
        TilePane pane = new TilePane();
        pane.setVgap(5);
        pane.setHgap(5);
        pane.getChildren().add(new Button("Button1"));
        pane.getChildren().add(new Button("Button2"));
        pane.getChildren().add(new Button("Button3"));
        pane.getChildren().add(new Button("Button4"));
        pane.getChildren().add(new Button("Button5"));
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
