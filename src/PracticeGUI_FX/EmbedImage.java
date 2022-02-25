package PracticeGUI_FX;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;



public class EmbedImage extends Application {

    @Override
    public void start(Stage primaryStage){

        FlowPane pane = new FlowPane();
        Image carImage = new Image("E:/SheridanAllDocs/SecSem/JAVA2/HelloWorldMain/src/PracticeGUI_FX/bmw.jpg");
        ImageView carView = new ImageView(carImage);
        pane.getChildren().add(carView);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
