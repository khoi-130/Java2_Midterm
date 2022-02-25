package helloworldmain;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class HelloWorldMain extends Application {
    
    public void start(Stage primaryStage) {
        FlowPane pane = new FlowPane();
        
        Label lblForm = new Label("Form");
        pane.getChildren().add(lblForm);
        
        Button btnSubmit = new Button("Submit");
        pane.getChildren().add(btnSubmit);
        
        TextField txtEmail = new TextField("Email");
        pane.getChildren().add(txtEmail);
        PasswordField pass = new PasswordField ();
        pane.getChildren().add(pass);
        
        CheckBox cbSubscribe = new CheckBox("Subscribe");
        pane.getChildren().add(cbSubscribe);
        
        RadioButton rbMonthly= new RadioButton("Monthly");
        RadioButton rbWeekly = new RadioButton("Weekly");
        pane.getChildren().add(rbMonthly);
        pane.getChildren().add(rbWeekly);
        
        ToggleGroup group = new ToggleGroup();
        rbMonthly.setToggleGroup(group);
        rbWeekly.setToggleGroup(group);
        
        ChoiceBox cbColors = new ChoiceBox();
        cbColors.setItems(FXCollections.observableArrayList(
            "Red", "Green","Blue") );
        pane.getChildren().add(cbColors);

        Scene scene = new Scene(pane, 650, 50);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}