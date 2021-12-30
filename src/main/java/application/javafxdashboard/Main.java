package application.javafxdashboard;

import application.javafxdashboard.Controllers.SceneController;
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        SceneController.LoadInitialScene(primaryStage);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}