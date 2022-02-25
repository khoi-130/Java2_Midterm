package PracticeGUI_FX;

import java.util.Random;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class DiceRoll extends Application {

    Label lblDice;
    Button btnRoll;

    public void start(Stage primaryStage) {
        
        FlowPane pane = new FlowPane();
        lblDice = new Label(" ");
        btnRoll = new Button("Roll");
        
        btnRoll.setOnAction(e -> rolldice());
   
        pane.setHgap(10);
        pane.getChildren().addAll(btnRoll, lblDice);

        Scene scene = new Scene(pane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void setDice(int num) {
        lblDice.setText(num+ "");
    }
    
    public int roll() {
        Random dice = new Random();
        return dice.nextInt(6)+1;
    }

    public void rolldice() {
        setDice(roll());
    }
    
    public static void main(String[] args ) {
        launch(args);
    }
}