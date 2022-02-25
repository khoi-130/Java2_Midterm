package helloworldmain;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class HelloWorldEvent extends Application {
    Button btnHello;
    Label lblHello;

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");

        lblHello = new Label("Hello");
        btnHello = new Button("World");
        btnHello.setOnAction(e -> ByeWorld());
        FlowPane pane = new FlowPane();
        pane.setHgap(10);
        pane.getChildren().addAll(lblHello, btnHello);

        Scene scene = new Scene(pane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void ByeWorld() {
        lblHello.setText("Bye World");
    }

    public static void main(String[] args ) {
        launch(args);
    }
}