/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package helloworldmain;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Contact extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       primaryStage.setTitle("Test");
        BorderPane pane= new BorderPane();
        TilePane center = new TilePane(Orientation.VERTICAL);
        BorderPane input = new BorderPane();
        GridPane fields = new GridPane();
        HBox buttons = new HBox();
        Label lblName = new Label("Name: ");
        Label lblNumber = new Label("Number: ");       
        Label lblAddress = new Label("Address: ");
        Label lblEmail = new Label("Email: ");       
        TextField txtName = new TextField();       
        TextField txtNumber = new TextField();       
        TextField txtAddress = new TextField();       
        TextField txtEmail = new TextField();       
        Button btnSave = new Button("Save");
        Button btnNext = new Button("Next");
        Button btnPrevious = new Button("Previous");
        TextArea taDisplay = new TextArea();
        
        
        input.setTop(fields);
        input.setBottom(taDisplay);
        input.setRight(btnSave);
        pane.setCenter(input);
        
        
        pane.setTop(new Label("Contact"));
        buttons.setPadding(new Insets(5));
        buttons.setSpacing(5);
        buttons.getChildren().add(btnPrevious);
        buttons.getChildren().add(btnNext);
        
        pane.setBottom(buttons);      
        
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
