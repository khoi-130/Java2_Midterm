package PracticeGUI_FX;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.collections.*;
import javafx.geometry.*;


public class TestFlowLayout extends Application{
        public void start(Stage primaryStage){
            BorderPane pane = new BorderPane();
            
            pane.setPadding(new Insets(10));
//            pane.setVgap(4);
//            pane.setHgap(4);
//            pane.setPrefWrapLength(200);
            
            
            
            Button btn1 = new Button("Button 1");
            Button btn2 = new Button("Button 2");
            Button btn3 = new Button("Button 3");
            Button btn4 = new Button("Button 4");
            Button btn5 = new Button("Button 5");
            Button btn6 = new Button("Button 6");
            
            btn1.setPrefSize(100, 50);
            
            pane.getChildren().addAll(btn1, btn2, btn3, btn4, btn5, btn6);
            
            Scene scene = new Scene(pane, 300,200);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        
        public static void main(String[] args){
            launch(args);
        }
}
