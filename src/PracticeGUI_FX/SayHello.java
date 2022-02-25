package PracticeGUI_FX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class SayHello extends Application {
    
    TextField txtName;
    Label lblGreeting;
    Button btnHello;
    
    @Override
    public void start(Stage primaryStage) {
        FlowPane pane = new FlowPane();
        lblGreeting = new Label(" ");
        btnHello = new Button("Hello");
        txtName = new TextField();
        
        btnHello.setOnAction( (e) -> sayHello() );
        
        pane.setHgap(10);
        pane.getChildren().addAll(txtName, btnHello, lblGreeting);
        
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
  
    public String getName() {
        return txtName.getText();
    }
    
    public void setGreeting(String greeting) {
        lblGreeting.setText(greeting);
    }
  
    
    public void sayHello() {
        setGreeting("Hello " + getName());
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
