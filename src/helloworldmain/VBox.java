 package helloworldmain;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class VBox extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Test");
        FlowPane pane = new FlowPane();
        
        Button btn1 = new Button("Button1");
        Button btn2 = new Button("Button2");
        Button btn3 = new Button("Button3");
        Button btn4 = new Button("Button4");
        Button btn5 = new Button("Button5");
        
        pane.setPadding(new Insets(10));
        pane.setVgap(4);
        pane.setHgap(4);
        pane.setPrefWrapLength(200);
        
        btn1.setPrefSize(100,50);
        btn2.setPrefSize(100,50);
        btn3.setPrefSize(100,50);
        btn4.setPrefSize(100,50);
        btn5.setPrefSize(100,50);
        pane.getChildren().add(btn1);
        pane.getChildren().add(btn2);
        pane.getChildren().add(btn3);
        pane.getChildren().add(btn4);
        pane.getChildren().add(btn5);
        
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
