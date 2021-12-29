package application.javafxdashboard;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        Text text = new Text("");
        btn.setText("Say 'Hello World'");
        btn.setOnAction(event -> text.setText("Hello World!"));
        primaryStage.getIcons().add(new Image(String.valueOf(getClass().getResource("images/icon.png"))));
        VBox box = new VBox(btn, text);
        box.setAlignment(Pos.CENTER);
        Scene root = new Scene(box, 300, 250);
        primaryStage.setScene(root);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}